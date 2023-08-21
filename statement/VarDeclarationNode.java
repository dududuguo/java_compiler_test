package statement;

import AST.ASTNode;

public class VarDeclarationNode extends ASTNode {
    private final String varName;
    private final ASTNode initializer; // It's an ASTNode because the initializer can be a complex expression.

    public VarDeclarationNode(String varName, ASTNode initializer) {
        super(varName);
        this.varName = varName;
        this.initializer = initializer;
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getInitializer() {
        return initializer;
    }

    @Override
    public void print(int depth) {

    }
}
