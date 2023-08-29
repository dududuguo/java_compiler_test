package AST.LiteralNode;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CharLiterNode extends ASTNode {

    final int offset = 8;
    final int size = 1;
    String type = "char";
    String VarName;

    public CharLiterNode(String VarName) {
        super(VarName);
    }
}
