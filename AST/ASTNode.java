package AST;

public abstract class ASTNode {
    public abstract void print(int depth);

    protected void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    public ASTNode[] getChildren() {
        return new ASTNode[0];
    }
}

class BinaryExpr extends ASTNode {
    private ASTNode left;
    private String op;
    private ASTNode right;

    public BinaryExpr(ASTNode left, String op, ASTNode right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }

    @Override
    public void print(int depth) {
        printIndent(depth);
        System.out.println("BinaryExpr (" + op + ")");
        if (left != null) left.print(depth + 1);
        if (right != null) right.print(depth + 1);
    }
}

class AtomExpr extends ASTNode {
    private String value;

    public AtomExpr(int value) {
        this.value = Integer.toString(value);
    }

    public AtomExpr(String value) {
        this.value = value;
    }

    @Override
    public void print(int depth) {
        printIndent(depth);
        System.out.println("AtomExpr (" + value + ")");
    }
}