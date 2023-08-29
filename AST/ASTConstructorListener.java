package AST;

import ANTLR_code.SimpleExprBaseListener;
import ANTLR_code.SimpleExprParser;
import AST.LiteralNode.*;
import DataType.dataTypes;
import Symbol_Table.Symbol;
import Symbol_Table.SymbolTable;
import assembly.AssemblyGenerator;
import lombok.Getter;
import statement.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ASTConstructorListener extends SimpleExprBaseListener {
    private final ASTNode FUNC_CALL_MARKER = new FUNC_CALL_MARKER("FUNC_CALL_MARKER");
    private ASTNode root;
    private Stack<ASTNode> stack = new Stack<>();
    @Getter
    private SymbolTable symbolTable = new SymbolTable();
    private AssemblyGenerator assemblyGenerator = new AssemblyGenerator();
    private dataTypes dataType = new dataTypes();
    private final int X86Offset = 8;
    private FunctionSymbol functionSymbol = new FunctionSymbol();
    private boolean isMain = false;

    public ASTNode getAST() {
        return root;
    }

    // 进入程序
    @Override
    public void enterProg(SimpleExprParser.ProgContext ctx) {
        System.out.println("Debug: Entering program: " + ctx.getText());
        functionSymbol = new FunctionSymbol();
        ASTNode root = null;

        // Find and process the main function first
        for (SimpleExprParser.StatContext statCtx : ctx.stat()) {
            System.out.println("111" + statCtx.getText());
            if (statCtx.functionDefinition() != null) {
                System.out.println("222" + statCtx.getText());
                var function = statCtx.functionDefinition().returnTypeFunction().functionDeclaration();
                if (function.getText() != null) {
                    List<ASTNode> parameters = new ArrayList<>();
                    var paramListContext = function.paramList().param(0);
                    for (int i = 0; i < paramListContext.getChildCount(); i += 2) {
                        System.out.println("Debug: parameter type: " + paramListContext.getChild(i).getText());
                        switch (paramListContext.getChild(i).getText()) {
                            case "int":
                                parameters.add(new IntLiteralNode(paramListContext.getChild(i + 1).getText()));
                                break;
                            case "float":
                                parameters.add(new FloatLiteralNode(paramListContext.getChild(i + 1).getText()));
                                break;
                        }
                    }

                    functionSymbol.addFunctionSymbol(function.ID().getText(),
                            new FunctionCallNode(function.ID().getText(), root,
                                    function.type().getText()), parameters, null);
                }

            } else if (statCtx.main() != null) {
                this.enterMain(statCtx.main());
                this.exitMain(statCtx.main());
                functionSymbol.addFunctionSymbol("int",
                        new FunctionCallNode("main", null, "int"), null, null);
                isMain = true;
                root = new FunctionCallNode("main", null, "int");
            }
        }

        // 检查是否存在main函数入口
//        if (!isMain) {
//            throw new RuntimeException("Error: No main function found");
//        }
    }


    // 处理变量声明
    @Override
    public void enterVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        System.out.println("Debug: Processing declaration for variable: " + ctx.ID().getText());
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        Symbol symbol = new Symbol(varName, varType, "global");
        symbol.setOffset(X86Offset);
        dataType.setTotalOffset(X86Offset);
        symbolTable.addSymbol(symbol);

        // Creating a VarDeclarationNode and pushing it to the stack
        VarDeclarationNode varNode = new VarDeclarationNode(varName, null);
        stack.push(varNode);
    }

    // 添加操作符
    public void enterAddExpr(SimpleExprParser.AddExprContext ctx) {
        System.out.println("Debug: Processing add expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "+", null);
        stack.push(node);
    }

    // 减法处理
    @Override
    public void enterSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        System.out.println("Debug: Processing subtract expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "-", null);
        stack.push(node);
    }

    // 退出加法
    @Override
    public void exitAddExpr(SimpleExprParser.AddExprContext ctx) {
        System.out.println("Debug: Exiting add expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        System.out.println("Debug: Left: " + left + ", Right: " + right);
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
        opNode.addChild(left);
        opNode.addChild(right);
        // No need to push opNode back on the stack, it's already there
    }

    // 退出减法
    @Override
    public void exitSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        System.out.println("Debug: Exiting subtract expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

    // 进入表达式
    @Override
    public void enterIdExpr(SimpleExprParser.IdExprContext ctx) {
        System.out.println("Debug: Processing identifier expression: " + ctx.getText());
        IdentifierNode idNode = new IdentifierNode(ctx.ID().getText());
        stack.push(idNode);
    }

    @Override
    public void enterIntLiteral(SimpleExprParser.IntLiteralContext ctx) {
        System.out.println("Debug: Processing integer literal expression: " + ctx.getText());
        IntLiteralNode intNode = new IntLiteralNode(ctx.INT().getText());
        stack.push(intNode);
    }

    @Override
    public void enterFloatLiteral(SimpleExprParser.FloatLiteralContext ctx) {
        System.out.println("Debug: Processing float literal expression: " + ctx.getText());
        FloatLiteralNode floatNode = new FloatLiteralNode(ctx.FLOAT().getText());
        stack.push(floatNode);
    }

    // 乘法处理
    @Override
    public void enterMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx) {
        System.out.println("Debug: Processing multiplication expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "*", null);
        stack.push(node);
    }

    // 退出乘法
    @Override
    public void exitMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx) {
        System.out.println("Debug: Exiting multiplication expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

    // 除法处理
    @Override
    public void enterDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        System.out.println("Debug: Processing divide expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "/", null);
        stack.push(node);
    }

    @Override
    public void exitDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        System.out.println("Debug: Exiting divide expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

    // 退出表达式
    @Override
    public void exitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        System.out.println("Debug: Exiting variable declaration: " + ctx.getText());
        ASTNode initializer = null;
        if (ctx.expr() != null) {
            if (!stack.isEmpty() && !(stack.peek() instanceof AssignStatementNode)) {
                initializer = stack.pop();  // 弹出初始化器（如果存在）
            }
        }
        if (!stack.isEmpty() && stack.peek() instanceof VarDeclarationNode) {
            String varType = ctx.type().getText();
            VarDeclarationNode varDeclNode = (VarDeclarationNode) stack.peek();
            varDeclNode.setVarType(varType);
            if (initializer != null) {
                varDeclNode.addChild(initializer);
            }
        }
    }

    // 进入赋值语句
    @Override
    public void enterAssignStatement(SimpleExprParser.AssignStatementContext ctx) {
        System.out.println("Debug: Entering assignment statement: " + ctx.getText());
        System.out.println("Debug: Creating AssignStatementNode for variable: " + ctx.getText());
        String expr = ctx.expr().getText();
//        if(symbolTable.containsSymbol(expr)){
//            stack.push(new FunctionCallNode(ctx.ID().getText()));
//        }
        // 如果被赋值的是函数调用
        if (expr.contains("(") && expr.contains(")")) {
            stack.push(new FunctionCallNode(ctx.ID().getText(), stack.peek(), null));
        } else if (expr.contains("(") || expr.contains(")")) {
            throw new RuntimeException("Error: Parentheses mismatch");
        } else
            stack.push(new AssignStatementNode(ctx.ID().getText(), null, null, 0));
    }

    // 退出赋值语句
    @Override
    public void exitAssignStatement(SimpleExprParser.AssignStatementContext ctx) {
        // Debug output
        System.out.println("Debug: Created AssignStatementNode for variable: " + ctx.getText() + ctx.ID().getSymbol().getType());
        System.out.println("Debug: Exiting assignment statement: " + ctx.ID().getSymbol().toString());

        ASTNode expression = stack.pop();  // The right side of the assignment
        String varName = ctx.ID().getText();

        SymbolTable symbolTable = getSymbolTable();
        Symbol symbol = symbolTable.getSymbol(varName);

        // check if the variable is declared
        if (symbol == null) {
            throw new RuntimeException("Variable " + varName + " not declared");
        }

        AssignStatementNode assignNode = new AssignStatementNode(varName, expression, symbol.getType(), symbol.getOffset());
        stack.push(assignNode);
    }

    // 函数调用
    @Override
    public void enterCallFunction(SimpleExprParser.CallFunctionContext ctx) {
        System.out.println("Debug: Processing CallContext for Function: " + ctx.ID().getText());
        String functionName = ctx.ID().getText();

        // Here, we don't create a node yet, we'll do that in the exit method
        // But we can push a marker to help us identify the start of the function call.
        stack.push(FUNC_CALL_MARKER);
        stack.push(new FunctionCallNode(functionName, null, null));
    }


    @Override
    public void enterFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx) {
        System.out.println("Debug: Entering FunctionDeclarationContext for Function: " + ctx.ID().getText());
        // Immediately create a FunctionCallNode and add it to the symbol table
        FunctionCallNode functionNode = new FunctionCallNode(ctx.ID().getText(), null, ctx.type().getText());
        FunctionSymbol functionSymbol = new FunctionSymbol(ctx.ID().getText(), functionNode, ctx.type().getText());
        symbolTable.add(ctx.ID().getText(), functionSymbol);
        stack.push(functionNode);
    }

    // 退出函数
    public void exitCallFunction(SimpleExprParser.CallFunctionContext ctx) {
        System.out.println("Debug: Exiting CallContext for Function: " + ctx.ID().getText());

        FunctionCallNode functionCallNode = new FunctionCallNode(ctx.ID().getText(), stack.peek(), null);
        // Pop all arguments (or expressions) from the stack until we hit the FUNC_CALL_MARKER
        while (!stack.isEmpty() && !(stack.peek() instanceof FUNC_CALL_MARKER)) {
            ASTNode argNode = stack.pop();
            functionCallNode.addChild(0, argNode);  // Adding at the beginning to preserve order
            enterCallFunction(ctx);
            // Remove the FUNC_CALL_MARKER from the stack
            stack.pop();
        }

        if (functionSymbol == null) {
            throw new RuntimeException("Function symbol for " + ctx.ID().getText() + " not found in the symbol table!");
        }

        // Find the FunctionCallNode that represents the function's body/block using the function name.
        FunctionCallNode functionDefinitionNode = functionSymbol.getFunctionNode();

        // Execute the function's body/block
        if (functionDefinitionNode == null) {
            throw new RuntimeException("Function definition for " + ctx.ID().getText() + " not found!");
        }
        stack.push(functionCallNode);
    }


    @Override
    public void exitFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx) {
        System.out.println("Debug: Exiting FunctionDeclarationContext for Function: " + ctx.ID().getText());
        ASTNode functionSymbol = new FunctionCallNode(ctx.ID().getText(), stack.peek(), ctx.type().getText());

        // Here, we can pop children nodes from the stack and add them as children to the functionSymbol.
        // We can do this until we hit a FUNC_CALL_MARKER or until the stack is empty.

        while (!stack.isEmpty() && !(stack.peek() instanceof FUNC_CALL_MARKER)) {
            ASTNode childNode = stack.pop();
            functionSymbol.addChild(0, childNode);  // Adding at the beginning to preserve order
        }
        stack.push(functionSymbol);
    }


    // 函数参数处理
    @Override
    public void enterParameter(SimpleExprParser.ParameterContext ctx) {
        System.out.println("Debug: Processing ParameterContext for Function parameter: " + ctx.ID().getText());
        String paramName = ctx.ID().getText();
        String paramType = ctx.type().getText();

        // debugging.
        System.out.println("Parameter Name: " + paramName + ", Parameter Type: " + paramType);
    }

    // if语句处理
    @Override
    public void enterIfStatement(SimpleExprParser.IfStatementContext ctx) {
        System.out.println("Debug: Entering if statement: " + ctx.getText());
        IfStatementNode ifNode = new IfStatementNode();
        stack.push(ifNode);  // Push the IfStatementNode on the stack immediately after creating it
    }

    @Override
    public void exitIfStatement(SimpleExprParser.IfStatementContext ctx) {
        System.out.println("Debug: Exiting if statement: " + ctx.getText());

        ASTNode thenBlock = stack.pop();  // First pop the thenBlock (e.g., ReturnStatementNode) from the stack
        ASTNode condition = stack.pop();  // Next pop the condition (e.g., ComparisonNode) from the stack
        ASTNode ifNode = stack.pop();     // Finally, pop the IfStatementNode from the stack


        if (!(ifNode instanceof IfStatementNode)) {
            throw new RuntimeException("Expected IfStatementNode on top of the stack");
        }

        ((IfStatementNode) ifNode).setCondition(condition);
        ((IfStatementNode) ifNode).addChild(condition);

        ((IfStatementNode) ifNode).setThenBlock(thenBlock);
        ((IfStatementNode) ifNode).addChild(thenBlock);


        if (ctx.ELSE() != null) {
            // If there's an 'else' block
            ASTNode elseBlock = stack.pop();
            ((IfStatementNode) ifNode).setElseBlock(elseBlock);
            ((IfStatementNode) ifNode).addChild(elseBlock);
        }

        System.out.println(ctx.getText() + " -> " + ifNode);
        stack.push(ifNode);  // Finally, push the fully constructed IfStatementNode back on the stack
    }



    // 处理比较表达式的进入
    @Override
    public void enterComparisonExpr(SimpleExprParser.ComparisonExprContext ctx) {
        System.out.println("Debug: Entering comparison expression: " + ctx.getText());
        ASTNode.ComparisonNode comparisonNode = new ASTNode.ComparisonNode(ctx.getText());
        stack.push(comparisonNode);
    }

    // 处理比较表达式的退出
    @Override
    public void exitComparisonExpr(SimpleExprParser.ComparisonExprContext ctx) {
        System.out.println("Debug: Exiting comparison expression: " + ctx.getText());
        ASTNode rightOperand = stack.pop();
        ASTNode leftOperand = stack.pop();
        ASTNode.ComparisonNode comparisonNode = (ASTNode.ComparisonNode) stack.pop();  // 获取现有的ComparisonNode
        comparisonNode.addChild(leftOperand);
        comparisonNode.addChild(rightOperand);
        stack.push(comparisonNode);
    }


    @Override
    public void exitReturnStatement(SimpleExprParser.ReturnStatementContext ctx) {
        System.out.println("Debug: Processing return statement: " + ctx.getText());

        // Check if there's an expression associated with the return statement
        ASTNode returnValue = null;
        if (ctx.expr() != null && !stack.isEmpty()) {
            returnValue = stack.pop(); // Pop the return value from the stack
        }

        // Create the ReturnStatementNode and push it onto the stack
        ReturnStatementNode returnNode = new ReturnStatementNode(returnValue);
        if (returnValue != null) {
            returnNode.addChild(returnValue);
        }
        stack.push(returnNode);
    }

    @Override
    public void enterReturnStatement(SimpleExprParser.ReturnStatementContext ctx) {
        System.out.println("Debug: Entering return statement: " + ctx.getText());
//        System.exit(0);
    }

    // 退出程序
    @Override
    public void exitProg(SimpleExprParser.ProgContext ctx) {
        System.out.println("Debug: Exiting program: " + ctx.getText());
        ASTNode progNode = new RootNode("Program");
        while (!stack.isEmpty()) {
            progNode.addChild(0, stack.pop()); // 在前面插入，确保顺序正确
        }
        root = progNode;
        assemblyGenerator.setLocalVariablesCount(dataType.getTotalOffset());
    }
}