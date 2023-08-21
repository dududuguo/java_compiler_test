package AST.LiteralNode;

import AST.ASTNode;

// IdentifierNode 定义
public class IdentifierNode extends ASTNode {
    public IdentifierNode(String value) {
        super(value);
    }

    @Override
    public void print(int depth) {
    }

    public String getName() {
        return value;
    }
}
