package statement;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReturnStatementNode extends ASTNode {
    private ASTNode returnValue;

    public ReturnStatementNode(ASTNode returnValue) {
        super("return");
        this.returnValue = returnValue;
    }
}
