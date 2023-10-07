package AST.LiteralNode;

import AST.ASTNode;

public class FUNC_CALL_MARKER extends ASTNode {
    private String value;

    public FUNC_CALL_MARKER(String value) {
        super(value);
    }
}
