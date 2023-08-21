package statement;

import AST.ASTNode;

public class AssignStatementNode extends ASTNode {
    private final String varName;
    private final ASTNode expression;

    public AssignStatementNode(String varName, ASTNode expression) {
        super(varName);
        this.varName = varName;
        this.expression = expression;
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public void print(int depth) {

    }
}
