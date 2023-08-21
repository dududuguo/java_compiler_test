package AST.LiteralNode;

import AST.ASTNode;

public class FloatLiteralNode extends ASTNode {
    public FloatLiteralNode(String value) {
        super(value);
    }

    @Override
    public void print(int depth) {

    }

    String getValue() {
        return value;
    }
}
