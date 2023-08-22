package statement;

import AST.ASTNode;

public class FunctionSymbol extends ASTNode {
    private final String returnType;
    public FunctionSymbol(String functionName, String returnType) {
        super(functionName);
        this.returnType = returnType;
    }

    public String getReturnType() {
        return returnType;
    }

    @Override
    public void print(int depth) {

    }
}
