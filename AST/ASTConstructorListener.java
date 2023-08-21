package AST;

import ANTLR_code.SimpleExprBaseListener;
import ANTLR_code.SimpleExprParser;
import AST.LiteralNode.FloatLiteralNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import Symbol_Table.*;
import assembly.AssemblyGenerator;
import statement.AssignStatementNode;
import statement.VarDeclarationNode;

import java.util.Stack;

public class ASTConstructorListener extends SimpleExprBaseListener {
    private ASTNode root;
    private Stack<ASTNode> stack = new Stack<>();
    private SymbolTable symbolTable = new SymbolTable();
    AssemblyGenerator assemblyGenerator = new AssemblyGenerator();

    public ASTNode getAST() {
        return root;
    }

    @Override
    public void enterDeclaration(SimpleExprParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();  // Assuming you have a 'type' rule in your grammar
        Symbol symbol = new Symbol(varName, varType, "global");  // Assuming global scope for simplicity
        symbolTable.addSymbol(symbol);
    }

    @Override
    public void enterVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        Symbol symbol = new Symbol(varName, varType, "global");
        symbolTable.addSymbol(symbol);
    }


    public void enterAddExpr(SimpleExprParser.AddExprContext ctx) {

        System.out.println("Entered Add Expression");
        BinaryOpNode node = new BinaryOpNode(null, "+", null);
        stack.push(node);
    }

    @Override
    public void enterSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        BinaryOpNode node = new BinaryOpNode(null, "-", null);
        stack.push(node);
    }

    @Override
    public void exitAddExpr(SimpleExprParser.AddExprContext ctx) {
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = new BinaryOpNode(left, "+", right);
        stack.push(opNode);
    }


    @Override
    public void exitSubtractExpr(SimpleExprParser.SubtractExprContext ctx) {
        ASTNode right = stack.pop();  // Right operand
        ASTNode left = stack.pop();   // Left operand
        BinaryOpNode opNode = new BinaryOpNode(left, "-", right);
        stack.push(opNode);
    }

    @Override
    public void enterIdExpr(SimpleExprParser.IdExprContext ctx) {
        IdentifierNode idNode = new IdentifierNode(ctx.ID().getText());
        stack.push(idNode);
    }

    @Override
    public void enterIntLiteral(SimpleExprParser.IntLiteralContext ctx) {
        IntLiteralNode intNode = new IntLiteralNode(ctx.INT().getText());
        stack.push(intNode);
    }

    @Override
    public void enterFloatLiteral(SimpleExprParser.FloatLiteralContext ctx) {
        FloatLiteralNode floatNode = new FloatLiteralNode(ctx.FLOAT().getText());
        stack.push(floatNode);
    }

    // 乘法处理
    @Override
    public void enterMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx) {
        BinaryOpNode node = new BinaryOpNode(null, "*", null);
        stack.push(node);
    }

    @Override
    public void exitMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx) {
        BinaryOpNode right = (BinaryOpNode)stack.pop();
        BinaryOpNode opNode = (BinaryOpNode)stack.pop();
        ASTNode left = stack.pop();
        opNode.setLeft(left);
        opNode.setRight(right);
        stack.push(opNode);
    }

    // 除法处理
    @Override
    public void enterDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        BinaryOpNode node = new BinaryOpNode(null, "/", null);
        stack.push(node);
    }

    @Override
    public void exitDivideExpr(SimpleExprParser.DivideExprContext ctx) {
        BinaryOpNode right = (BinaryOpNode)stack.pop();
        BinaryOpNode opNode = (BinaryOpNode)stack.pop();
        ASTNode left = stack.pop();
        opNode.setLeft(left);
        opNode.setRight(right);
        stack.push(opNode);
    }

    // 逻辑运算

    @Override
    public void exitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx) {
        ASTNode initializer = null;
        if (ctx.expr() != null) {
            initializer = stack.pop();  // Pop the initializer if it exists
        }
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        VarDeclarationNode varDeclNode = new VarDeclarationNode(varType, initializer);
        stack.push(varDeclNode);
    }

    @Override
    public void exitAssignStatement(SimpleExprParser.AssignStatementContext ctx) {
        ASTNode expression = stack.pop();  // The right side of the assignment
        String varName = ctx.ID().getText();
        AssignStatementNode assignNode = new AssignStatementNode(varName, expression);
        stack.push(assignNode);
    }

    @Override
    public void exitProg(SimpleExprParser.ProgContext ctx) {
        root = stack.pop();
        assemblyGenerator.setLocalVariablesCount(symbolTable.getSymbols().size());
    }

    // 赋值运算
    // 函数处理
}