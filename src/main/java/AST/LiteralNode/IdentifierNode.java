package AST.LiteralNode;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// IdentifierNode 定义
public class IdentifierNode extends ASTNode {
    public IdentifierNode(String value) {
        super(value);
    }


    public void print(int depth) {
    }

    public String getName() {
        return value;
    }
}
