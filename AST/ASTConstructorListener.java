package AST;

import ANTLR_code.SimpleExprBaseListener;
import ANTLR_code.SimpleExprParser;
import AST.LiteralNode.FloatLiteralNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import DataType.dataTypes;
import Symbol_Table.Symbol;
import Symbol_Table.SymbolTable;
import assembly.AssemblyGenerator;
import statement.AssignStatementNode;
import statement.VarDeclarationNode;

import java.util.Stack;

public class ASTConstructorListener extends SimpleExprBaseListener {
    private ASTNode root;
    private Stack<ASTNode> stack = new Stack<>();
    private SymbolTable symbolTable = new SymbolTable();
    AssemblyGenerator assemblyGenerator = new AssemblyGenerator();
    private dataTypes dataType = new dataTypes();
    private final int X86Offset=8;

    public ASTNode getAST() {
        return root;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public void enterDeclaration(SimpleExprParser.DeclarationContext ctx) {
        System.out.println("Debug: Processing declaration for variable: " + ctx.ID().getText());
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();  // Assuming you have a 'type' rule in your grammar
        Symbol symbol = new Symbol(varName, varType, "global");  // Assuming global scope for simplicity
        symbolTable.addSymbol(symbol);
    }

    @Override
    public void enterVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        System.out.println("Debug: Processing declaration for variable: " + ctx.ID().getText());
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        Symbol symbol = new Symbol(varName, varType, "global");
        symbol.setOffset(X86Offset);
        dataType.setTotalOffset(X86Offset);
        symbolTable.addSymbol(symbol);
    }

    public void enterAddExpr(SimpleExprParser.AddExprContext ctx) {
        System.out.println("Debug: Processing add expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "+", null);
        stack.push(node);
    }

    @Override
    public void enterSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        System.out.println("Debug: Processing subtract expression: " + ctx.getText());
        BinaryOpNode node = new BinaryOpNode(null, "-", null);
        stack.push(node);
    }

    @Override
    public void exitAddExpr(SimpleExprParser.AddExprContext ctx) {
        System.out.println("Debug: Exiting add expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
        opNode.addChild(left);
        opNode.addChild(right);
        // No need to push opNode back on the stack, it's already there
    }

    @Override
    public void exitSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        System.out.println("Debug: Exiting subtract expression: " + ctx.getText());
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

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

    @Override
    public void exitMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx) {
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

    // 除法处理
    @Override
    public void enterDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        BinaryOpNode node = new BinaryOpNode(null, "/", null);
        stack.push(node);
    }

    @Override
    public void exitDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = (BinaryOpNode) stack.peek();
        opNode.setLeft(left);
        opNode.setRight(right);
    }

    // 逻辑运算
    @Override
    public void exitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        System.out.println("Debug: Exiting variable declaration: " + ctx.getText());
        ASTNode initializer = null;
        if (ctx.expr() != null) {
            initializer = stack.pop();  // Pop the initializer if it exists
        }
        String varType = ctx.type().getText();
        VarDeclarationNode varDeclNode = new VarDeclarationNode(varType, initializer);
        stack.push(varDeclNode);
    }

    @Override
    public void exitAssignStatement(SimpleExprParser.AssignStatementContext ctx) {
        ASTNode expression = stack.pop();  // The right side of the assignment
        String varName = ctx.ID().getText();
        // Debug output
        System.out.println("Debug: Created AssignStatementNode for variable: " + ctx.getText() + ctx.ID().getSymbol().getType());
        System.out.println("Debug: Exiting assignment statement: " + ctx.ID().getSymbol().toString());
        SymbolTable symbolTable = getSymbolTable();
        Symbol symbol = symbolTable.getSymbol(varName);

        // check if the variable is declared
        if (symbol == null) {
            throw new RuntimeException("Variable " + varName + " not declared");
        }
        AssignStatementNode assignNode = new AssignStatementNode(varName, expression, symbol.getType(), symbol.getOffset());
        stack.push(assignNode);
    }

    @Override
    public void exitProg(SimpleExprParser.ProgContext ctx) {
        System.out.println("Debug: Exiting program: " + ctx.getText());
        root = stack.pop();
        ASTNode progNode = root; // Replace 'SomeRootNode' with an appropriate node class for the root
        while (!stack.isEmpty()) {
            progNode.addChild(stack.pop()); // Add children in reverse order, since we're popping from a stack
        }
        root = progNode;
        assemblyGenerator.setLocalVariablesCount(dataType.getTotalOffset());
    }


    // 函数处理
//    @Override
//    public void enterFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx) {
//        String functionName = ctx.ID().getText();
//        String returnType = ctx.type().getText();
//        FunctionSymbol functionSymbol = new FunctionSymbol(functionName, returnType);
//    }
}