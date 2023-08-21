package AST.LiteralNode;

import AST.ASTNode;

public class IntLiteralNode extends ASTNode {
    public IntLiteralNode(String value) {
        super(value);
    }

    @Override
    public void print(int depth) {
    }

    public String getValue() {
        return value;
    }
}
