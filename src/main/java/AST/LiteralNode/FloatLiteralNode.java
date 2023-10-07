package AST.LiteralNode;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FloatLiteralNode extends ASTNode {
    public FloatLiteralNode(String value) {
        super(value);
    }


    public void print(int depth) {

    }
}
