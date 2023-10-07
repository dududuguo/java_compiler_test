package statement;

import AST.ASTNode;
import AST.LiteralNode.FunctionCallNode;
import Symbol_Table.Symbol;
import com.kitfox.svg.A;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
// 函数符号. 在符号表中, 函数符号的类型是函数的返回值类型
public class FunctionSymbol extends Symbol {
    // 记录函数的名称
    private String functionName;
    // 记录函数的返回值类型
    private final String returnType;
    // 记录函数的参数列表
    private List<ASTNode> parameters=new ArrayList<>();
    // 记录函数
    private Set<FunctionCallNode> functionSymbols=new HashSet<>();

    public FunctionSymbol(){
        super("ROOT_FUNCTION", null, null);
        this.returnType = null;
    }

    public FunctionSymbol(String functionName, String returnType) {
        super(functionName, returnType, "global");
        this.returnType = returnType;
    }

    public FunctionSymbol(String functionName, FunctionCallNode functionNode, String returnType) {
        super(functionName, functionNode.getReturnType(), "global");
        this.returnType = returnType;
    }

    public void setExpression(ASTNode expression) {
    }

    ASTNode findParameter(String parameterName){
        for (ASTNode parameter:parameters){
            if (parameter.getValue().equals(parameterName)){
                return parameter;
            }
        }
        return null;
    }

    public void addParameter(ASTNode parameter){
        parameters.add(parameter);
    }

    // functionSymbols存储所有的函数调用节点
    // functionName存储函数的名称
    public void addFunctionSymbol(String functionName, FunctionCallNode functionCallNode, List<ASTNode> Parameters, ASTNode block){
        functionSymbols.add(functionCallNode);
        this.functionName=functionName;
        this.parameters=Parameters;
        functionCallNode.addBlock(block);
    }

    public FunctionCallNode findFunctionSymbol(String functionName){
        return functionSymbols.stream().filter(functionCallNode ->
                functionCallNode.getValue().equals(functionName)).findFirst().orElse(null);
    }

    public FunctionCallNode getFunctionNode() {
        return functionSymbols.stream().findFirst().orElse(null);
    }
}
