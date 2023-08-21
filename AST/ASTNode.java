package AST;

public abstract class ASTNode {
    protected String value;

    public abstract void print(int depth);

    public ASTNode(String value) {
        this.value = value;
    }

    protected void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    public ASTNode[] getChildren() {
        return new ASTNode[0];
    }
}
