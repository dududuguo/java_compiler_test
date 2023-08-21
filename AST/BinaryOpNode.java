package AST;

public class BinaryOpNode extends ASTNode{
    // BinaryOpNode.java
        public ASTNode left;
        public ASTNode right;
        public String operator;

    public BinaryOpNode(ASTNode left,String op, ASTNode right) {
        super(op);
        this.left = left;
        this.right = right;
        this.operator = op;
    }

    @Override
    public void print(int depth) {
        printIndent(depth);
        System.out.println("BinaryExpr (" + operator + ")");
        if (left != null) left.print(depth + 1);
        if (right != null) right.print(depth + 1);
    }

    public ASTNode getLeft() {
        return left;
    }

    @Override
    public ASTNode[] getChildren() {
        return super.getChildren();
    }

    public ASTNode getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }
}
