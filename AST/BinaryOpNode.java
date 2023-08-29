package AST;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
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

    public void print(int depth) {
        printIndent(depth);
        System.out.println("BinaryExpr (" + operator + ")");
        if (left != null) left.print(depth + 1);
        if (right != null) right.print(depth + 1);
    }

    @Override
    public ASTNode[] getChildren() {
        return super.getChildren();
    }
}
