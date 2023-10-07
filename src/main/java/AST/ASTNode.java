package AST;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public abstract class ASTNode {
    protected  String value;
    protected int offset;
    protected String VarType;
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

    //public abstract void print(int depth);

    protected void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    public void print(int depth){
        System.out.println("ASTNode (" + value + ")");
        for (ASTNode child : children) {
            child.print(depth + 1);
        }
    }
    public void addChild(int index, ASTNode child) {
        children.add(index, child);
    }

    @Setter
    @Getter
    public static class ComparisonNode extends ASTNode {
        private String operator;

        public ComparisonNode(String operator) {
            super("Comparison");
            this.operator = operator;
        }

        @Override
        public void print(int depth) {
            printIndent(depth);
            System.out.println("Comparison (" + operator + ")");
            for (ASTNode child : getChildren()) {
                child.print(depth + 1);
            }
        }
    }
}
