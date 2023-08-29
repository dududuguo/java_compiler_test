package AST.LiteralNode;

import AST.ASTNode;
import AST.BinaryOpNode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import statement.ReturnStatementNode;

@Getter
@Setter
@ToString
public class FunctionCallNode extends ASTNode {
    private String functionName;
    private String returnType;
    private ASTNode parent;
    private ASTNode block;

    public FunctionCallNode(String value, ASTNode parent, String returnType) {
        super(value);
        functionName=value;
        this.parent=parent;
        this.returnType=returnType;
    }

    public void addBlock(ASTNode block){
        this.block=block;
    }

    public Object executeBlock(FunctionCallNode functionNode) {
        // Recursively process each statement in the function's body.
        for (ASTNode statement : functionNode.getChildren()) {
            if (statement instanceof ReturnStatementNode) {
                // Assuming the return statement has an expression as a child.
                ASTNode expression = statement.getChildren()[0];
                if (expression instanceof IntLiteralNode) {
                    return ((IntLiteralNode) expression).getValue();
                } else if (expression instanceof FunctionCallNode) {
                    // Execute the function and return its result.
                    return executeBlock((FunctionCallNode) expression);
                } else if (expression instanceof BinaryOpNode) {
                    // Process binary operations like foo() + foo().
                    // You can expand on this as needed for other binary operations.
                    Object leftValue = executeExpression(((BinaryOpNode) expression).getLeft());
                    Object rightValue = executeExpression(((BinaryOpNode) expression).getRight());
                    switch (((BinaryOpNode) expression).getOperator()) {
                        case "+":
                            return (Integer) leftValue + (Integer) rightValue;
                        // Add other cases for other binary operators if needed.
                    }
                }
            }
        }
        return null;  // Default return if no return statement is found.
    }

    private Object executeExpression(ASTNode expression) {
        if (expression instanceof IntLiteralNode) {
            return ((IntLiteralNode) expression).getValue();
        } else if (expression instanceof FunctionCallNode) {
            return executeBlock((FunctionCallNode) expression);
        } else if (expression instanceof BinaryOpNode) {
            Object leftValue = executeExpression(((BinaryOpNode) expression).getLeft());
            Object rightValue = executeExpression(((BinaryOpNode) expression).getRight());
            switch (((BinaryOpNode) expression).getOperator()) {
                case "+":
                    return (Integer) leftValue + (Integer) rightValue;
                // Add other cases for other binary operators if needed.
            }
        }
        return null;  // Default return for unsupported expressions.
    }
}
