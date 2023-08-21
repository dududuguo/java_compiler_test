package assembly;

import AST.ASTNode;
import AST.BinaryOpNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import Symbol_Table.SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class AssemblyGenerator {

    private Map<String, Integer> symbolTable = new HashMap<>();
    private int stackOffset = 0;

    public String generateInitialAssemblyHeaders() {
        return ".section\t .data\n" +
                ".section\t .text\n" +
                ".globl\t main\n";
    }

    public String generateFunctionPrologue() {
        return "main:\n" +
                "push\t ebp\n" +
                "mov\t ebp, \tesp\n";
    }

    public String generateFunctionEpilogue() {
        return "mov\t eax, 0\n" +
                "leave\n" +
                "ret\n";
    }

    public String generateFromAST(ASTNode node) {
        return generateAssembly(node);
    }

    private String generateAssembly(ASTNode node) {
        if (node instanceof BinaryOpNode) {
            return generateFromBinaryOpNode((BinaryOpNode) node);
        } else if (node instanceof IdentifierNode) {
            return generateFromIdentifierNode((IdentifierNode) node);
        } else if (node instanceof IntLiteralNode) {
            return generateFromIntLiteralNode((IntLiteralNode) node);
        }
        return "";
    }


    private String generateFromBinaryOpNode(BinaryOpNode binOp) {
        System.out.println("Generating assembly for BinaryOpNode: " + binOp);
        String leftCode = generateAssembly(binOp.getLeft());
        String rightCode = generateAssembly(binOp.getRight());
        String operation = binOp.getOperator();
        StringBuilder assemblyCode = new StringBuilder();

        if (binOp.getLeft() instanceof IntLiteralNode || binOp.getLeft() instanceof IdentifierNode) {
            assemblyCode.append(leftCode);
        } else {
            assemblyCode.append(leftCode);
            assemblyCode.append("push	 eax\n");
        }

        if (binOp.getRight() instanceof IntLiteralNode || binOp.getRight() instanceof IdentifierNode) {
            assemblyCode.append("mov	 ebx, 	eax\n");
            assemblyCode.append(rightCode);
        } else {
            assemblyCode.append(rightCode);
            assemblyCode.append("pop	 ebx\n");
        }

        switch (operation) {
            case "+":
                assemblyCode.append("add	 eax, 	ebx\n");
                break;
            case "-":
                assemblyCode.append("sub	 eax, 	ebx\n");
                break;
            case "*":
                assemblyCode.append("mul	 ebx\n");
                break;
            case "/":
                assemblyCode.append("div	 ebx\n");
                break;
        }
        return assemblyCode.toString();
    }

    private String generateFromIdentifierNode(IdentifierNode idNode) {
        System.out.println("Generating assembly for IdentifierNode: " + idNode);
        String varName = idNode.getName();
        if (!symbolTable.containsKey(varName)) {
            stackOffset += 4;
            symbolTable.put(varName, stackOffset);
        }
        int varOffset = symbolTable.get(varName);
        return String.format("mov\t eax, \t[ebp-%d]\n", varOffset);
    }

    private String generateFromIntLiteralNode(IntLiteralNode intNode) {
        System.out.println("Generating assembly for IntLiteralNode: " + intNode);
        return "mov\t eax, \t" + intNode.getValue() + "\n";
    }
}
