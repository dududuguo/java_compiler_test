package assembly;

import AST.ASTNode;
import AST.BinaryOpNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import Symbol_Table.SymbolTable;
import statement.AssignStatementNode;
import statement.VarDeclarationNode;

import java.util.HashMap;
import java.util.Map;

public class AssemblyGenerator {

    private Map<String, Integer> symbolTable = new HashMap<>();
    private int stackOffset = 0;

    public String generateInitialAssemblyHeaders() {
        return ".section .data\n" +
                ".section .text\n" +
                ".globl main\n";
    }

    // 在函数前奏中为局部变量预留空间
    public String generateFunctionPrologue(int localVariablesSpace) {
        return "main:\n" +
                "push %rbp\n" +
                "movq %rbp, %rsp\n" +
                "subq %rsp, " + localVariablesSpace + "\n";  // Allocate space for local variables
    }

    public String generateFunctionEpilogue() {
        return "leave\n" +
                "ret\n";
    }

    public String generateFromAST(ASTNode node) throws Exception {
        return generateAssembly(node);
    }

    private String generateAssembly(ASTNode node) throws Exception {
        if (node instanceof BinaryOpNode) {
            return generateFromBinaryOpNode((BinaryOpNode) node);
        } else if (node instanceof IdentifierNode) {
            return generateFromIdentifierNode((IdentifierNode) node);
        } else if (node instanceof IntLiteralNode) {
            return generateFromIntLiteralNode((IntLiteralNode) node);
        } else if (node instanceof VarDeclarationNode) {
            return generateFromVarDeclarationNode((VarDeclarationNode) node);
        } else if (node instanceof AssignStatementNode) {
            return generateFromAssignStatementNode((AssignStatementNode) node);
        }
        return "";
    }

    private String generateFromBinaryOpNode(BinaryOpNode binOp) throws Exception {
        String leftCode = generateAssembly(binOp.getLeft());
        String rightCode = generateAssembly(binOp.getRight());
        String operation = binOp.getOperator();
        StringBuilder assemblyCode = new StringBuilder();

        assemblyCode.append(leftCode);
        assemblyCode.append("push %rax\n");
        assemblyCode.append(rightCode);
        assemblyCode.append("pop %rbx\n");

        switch (operation) {
            case "+":
                assemblyCode.append("addq %rax, %rbx\n");
                break;
            case "-":
                assemblyCode.append("subq %rax, %rbx\n");
                break;
            case "*":
                assemblyCode.append("mulq %rbx\n"); // This will multiply %rax by %rbx, result in edx:%rax
                break;
            case "/":
                assemblyCode.append("xor edx, edx\n"); // Clear edx
                assemblyCode.append("divq %rbx\n");
                break;
            default:
                throw new Exception("Unsupported binary operation: " + operation);
        }
        return assemblyCode.toString();
    }

    private String generateFromIdentifierNode(IdentifierNode idNode) {
        String varName = idNode.getName();
        if (!symbolTable.containsKey(varName)) {
            stackOffset += 4;
            symbolTable.put(varName, stackOffset);
        }
        int varOffset = symbolTable.get(varName);
        return String.format("movq %rax, [%rbp-%d]\n", varOffset);
    }

    private String generateFromIntLiteralNode(IntLiteralNode intNode) {
        return "movq %rax, " + intNode.getValue() + "\n";
    }


    private String generateFromVarDeclarationNode(VarDeclarationNode varDeclNode) throws Exception {
        StringBuilder assemblyCode = new StringBuilder();
        String varName = varDeclNode.getVarName();

        if (!symbolTable.containsKey(varName)) {
            stackOffset -= 4;  // Assuming each variable takes 4 bytes.
            symbolTable.put(varName, stackOffset);
        }

        // If there's an initializer, generate initialization code
        if (varDeclNode.getInitializer() != null) {
            assemblyCode.append(generateAssembly(varDeclNode.getInitializer()));
            int varOffset = symbolTable.get(varName);
            assemblyCode.append(String.format("movq dword [%rbp-%d], %rax\n", varOffset));
        }
        return assemblyCode.toString();
    }


    private String generateFromAssignStatementNode(AssignStatementNode assignNode) throws Exception {
        StringBuilder assemblyCode = new StringBuilder();
        String varName = assignNode.getVarName();

        // Only addq the variable to the symbolTable and update the stackOffset if it's not already present.
        if (!symbolTable.containsKey(varName)) {
            stackOffset -= 4;  // Assuming each variable takes 4 bytes.
            symbolTable.put(varName, stackOffset);
        }

        assemblyCode.append(generateAssembly(assignNode.getExpression()));
        int varOffset = symbolTable.get(varName);
        assemblyCode.append(String.format("movq dword [%rbp-%d], %rax", varOffset));

        return assemblyCode.toString();
    }


    public void setLocalVariablesCount(int count) {
        this.stackOffset = count * 4;  // Assuming each variable takes 4 bytes.
    }
}

