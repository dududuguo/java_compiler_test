package AST.LiteralNode;

import AST.ASTNode;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Getter
@Setter
// 语句块, 用于存储函数体
public class Block extends ASTNode {
    public List<ASTNode> children;
    public Block(String value) {
        super(value);
        this.children=new LinkedList<>();
    }


    public void addChild(ASTNode child) {
        children.add(child);
    }

    public ASTNode[] getChildren() {
        return children.toArray(new ASTNode[0]);
    }
}
