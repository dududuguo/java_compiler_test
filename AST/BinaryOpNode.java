package AST;

public class BinaryOpNode extends ASTNode{
    // BinaryOpNode.java
        public ASTNode left;
        public ASTNode right;
        public String operator;

    @Override
    public void print(int depth) {
        printIndent(depth);
        System.out.println("BinaryExpr (" + operator + ")");
        if (left != null) left.print(depth + 1);
        if (right != null) right.print(depth + 1);
    }
    // ... constructor, getters, setters, etc.
}
