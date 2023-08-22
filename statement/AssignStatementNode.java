package statement;

import AST.ASTNode;

public class AssignStatementNode extends ASTNode {
    private final String varName;
    private final ASTNode expression;
    private int offset;
    private String VarType;

    public AssignStatementNode(String varName, ASTNode expression, String VarType, int offset) {
        super(varName);
        this.varName = varName;
        this.expression = expression;
        this.VarType = VarType;
        this.offset = offset;
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    public String getVarType() {
        return VarType;
    }

    @Override
    public void print(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println("Assign: " + varName + " = ");
        expression.print(depth + 1);
    }

}
