package statement;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IfStatementNode extends ASTNode {
    private ASTNode condition;
    private ASTNode thenBlock;
    private ASTNode elseBlock;
    private ASTNode elseIfBlock;

    public IfStatementNode(ASTNode condition, ASTNode thenBlock, ASTNode elseBlock) {
        super("if");
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    public IfStatementNode() {
        super("if");
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }


    public void setThenBlock(ASTNode thenBlock) {
        this.thenBlock = thenBlock;
    }

    public void setElseBlock(ASTNode elseBlock) {
        this.elseBlock = elseBlock;
    }

}
