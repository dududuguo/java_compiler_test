package AST;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    protected String value;
    private List<ASTNode> children = new ArrayList<>();

    public ASTNode(String value) {
        this.value = value;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public ASTNode[] getChildren() {
        return children.toArray(new ASTNode[0]);
    }

    public abstract void print(int depth);

    protected void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }
}
