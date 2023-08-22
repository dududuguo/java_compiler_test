package assembly;

import AST.ASTNode;
import AST.BinaryOpNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import Register.Registers;
import statement.AssignStatementNode;
import statement.VarDeclarationNode;

import java.util.HashMap;
import java.util.Map;

public class AssemblyGenerator {

    private Map<String, Integer> OffsetTable = new HashMap<>();
    private Registers registers = new Registers();
    private int stackOffset = 0;
    private final int X86Offset=8;


    public AssemblyGenerator() {
    }

    public String generateInitialAssemblyHeaders() {
        return ".section .data\n" +
                ".section .text\n" +
                ".globl main\n";
    }

    // 在函数前奏中为局部变量预留空间
    public String generateFunctionPrologue(long localVariablesSpace) {
        return "main:\n" +
                "\tpushq \t%rbp\n" +
                "\tmovq  \t%rsp, \t%rbp\n" +
                "\tsubq \t$" + localVariablesSpace + ", \t%rsp\n\n";  // Allocate space for local variables
    }

    public String generateFunctionEpilogue() {
        return "\tleave\n" +
                "\tret";
    }

    public String generateReturnStatement() {
        return "\n\tmovq \t$0, \t%rax\n";
    }


    public String generateFromAST(ASTNode root) throws Exception {
        // Debug output
        System.out.println("Debug: Processing node: " + root.getClass().getSimpleName());
        StringBuilder body = new StringBuilder();
        for (int i = root.getChildren().length - 1; i >= 0; i--) {
            ASTNode node = root.getChildren()[i];
            body.append(generateAssembly(node));
        }
        return body.toString();
    }

    private String generateAssembly(ASTNode node) throws Exception {
        if (node instanceof BinaryOpNode) {
            return generateFromBinaryOpNode((BinaryOpNode) node);
        } else if (node instanceof IdentifierNode) {
            return generateFromIdentifierNode((IdentifierNode) node);
        } else if (node instanceof IntLiteralNode) {
            return generateFromIntLiteralNode((IntLiteralNode) node);
        } else if (node instanceof VarDeclarationNode) {
            System.out.println("Debug: Processing VarDeclarationNode for variable: " + ((VarDeclarationNode) node).getVarName());
            return generateFromVarDeclarationNode((VarDeclarationNode) node);
        } else if (node instanceof AssignStatementNode) {
            System.out.println("Debug: Processing AssignStatementNode for variable: " + ((AssignStatementNode) node).getVarName());
            return generateFromAssignStatementNode((AssignStatementNode) node);
        }
        return "";
    }

    private String generateFromBinaryOpNode(BinaryOpNode binOp) throws Exception {
        StringBuilder assemblyCode = new StringBuilder();

        // 1. Generate code for the left and right operands
        String leftCode = generateAssembly(binOp.getLeft());
        String rightCode = generateAssembly(binOp.getRight());
        assemblyCode.append(leftCode).append(rightCode);

        // 2. Determine the registers used for left and right operands
        String r1 = registers.getLastUsedRegister();
        String r2 = registers.getPreviousUsedRegister();

        switch (binOp.getOperator()) {
            case "+":
                assemblyCode.append("\taddq \t").append(r2).append(", \t").append(r1).append("\n");
                break;
            case "-":
                assemblyCode.append("\tsubq \t").append(r2).append(", \t").append(r1).append("\n");
                break;
            case "*":
                assemblyCode.append("\timulq \t").append(r2).append(", \t").append(r1).append("\n");
                break;
            case "/":
                // Handle division - you might need to ensure r1 is in RAX and use CDQ before IDIV
                assemblyCode.append("\tmovq \t").append(r1).append(", \t%rax\n");
                assemblyCode.append("\tcqo\n");  // sign extend rax into rdx:rax
                assemblyCode.append("\tidivq \t").append(r2).append("\n");
                break;
            default:
                throw new Exception("Unsupported binary operation: " + binOp.getOperator());
        }

        // Store the result in r1 (which is our primary register for operations)
        //registers.freeRegister(r2);  // We only need to free r2, r1 will still be used

        return assemblyCode.toString();
    }

    private String generateFromIdentifierNode(IdentifierNode idNode) {
        String varName = idNode.getName();
        if (!OffsetTable.containsKey(varName)) {
            stackOffset -= 8;  // Allocate 8 bytes for each variable
            OffsetTable.put(varName, stackOffset);
        }

        String register = registers.allocateRegisterForVariable(varName);
        int varOffset = OffsetTable.get(varName);

        // 大多数的 x86-64 汇编编程中，局部变量通常是相对于 %rbp 地址来存储的
        return "\tmovq \t" + varOffset + "(%rbp), \t" + register + "\n";
    }

    private String generateFromIntLiteralNode(IntLiteralNode intNode) {
        // 为常量分配一个寄存器并将其值移到该寄存器中
        String register = registers.allocateRegisterForVariable(intNode.getValue());
        return "\tmovq \t$" + intNode.getValue() + ", \t" + register + "\n";
    }


    private String generateFromVarDeclarationNode(VarDeclarationNode varDeclNode) throws Exception {
        StringBuilder assemblyCode = new StringBuilder();

        // 如果有初始化器，生成初始化代码
        if (varDeclNode.getInitializer() != null) {
            assemblyCode.append(generateAssembly(varDeclNode.getInitializer()));
            String register = registers.getLastUsedRegister();
            assemblyCode.append("\tmovq \t").append(register).append(", ")
                    .append(X86Offset).append("(%rbp)\n");  // 注意这里的正确语法
            registers.freeRegister(register);
        }

        return assemblyCode.toString();
    }


    // 赋值语句
    private String generateFromAssignStatementNode(AssignStatementNode assignNode) throws Exception {
        StringBuilder assemblyCode = new StringBuilder();
        String varName = assignNode.getVarName();
        System.out.println("Debug: AssignStatementNode: " + varName);

        if (!OffsetTable.containsKey(varName)) {
            stackOffset -= X86Offset;  // 假设每个变量在64位系统上占8个字节
            OffsetTable.put(varName, stackOffset);
            assignNode.setOffset(stackOffset);
            System.out.println("Debug: AssignStatementNode: " + varName + " not found in symbol table, allocating space");
        }

        assemblyCode.append(generateAssembly(assignNode.getExpression()));
        int varOffset = OffsetTable.get(varName);
        String sourceRegister;
        if (assignNode.getExpression() instanceof IntLiteralNode) {
            sourceRegister = "$" + ((IntLiteralNode) assignNode.getExpression()).getValue();
        } else {
            sourceRegister = registers.getLastUsedRegister();
        }
        assemblyCode.append("\tmovq \t").append(sourceRegister).append(", ").append(varOffset).append("(%rbp)\n");
        if (!(assignNode.getExpression() instanceof IntLiteralNode)) {
            registers.freeRegisterOfVariable(sourceRegister);
        }

        return assemblyCode.toString();
    }

    public void setLocalVariablesCount(int count) {
        this.stackOffset = -count * 8;  // Assuming each variable takes 8 bytes for a 64-bit system.
    }
}

