package AST.LiteralNode;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IntLiteralNode extends ASTNode {
    public IntLiteralNode(String value) {
        super(value);
    }

    public void print(int depth) {
    }

    public String getValue() {
        return value;
    }
}
