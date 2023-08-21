package AST;

import ANTLR_code.SimpleExprBaseListener;
import ANTLR_code.SimpleExprParser;
import AST.LiteralNode.FloatLiteralNode;
import AST.LiteralNode.IdentifierNode;
import AST.LiteralNode.IntLiteralNode;
import Symbol_Table.*;

import java.util.Stack;

public class ASTConstructorListener extends SimpleExprBaseListener {
    private ASTNode root;
    private Stack<ASTNode> stack = new Stack<>();
    private SymbolTable symbolTable = new SymbolTable();

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

    @Override
    public void enterExpr(SimpleExprParser.ExprContext ctx) {
        if (ctx.ADD() != null || ctx.MINUS() != null) {
            BinaryOpNode node = new BinaryOpNode(null, ctx.ADD() != null ? "+" : "-", null);
            stack.push(node);
        }
    }

    @Override
    public void enterMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx) {
        if (ctx.MUL() != null || ctx.DIV() != null) {
            BinaryOpNode node = new BinaryOpNode(null, ctx.MUL() != null ? "*" : "/", null);
            stack.push(node);
        }
    }

    @Override
    public void exitProg(SimpleExprParser.ProgContext ctx) {
        root = stack.pop();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public void exitExpr(SimpleExprParser.ExprContext ctx) {
        if (ctx.ADD() != null || ctx.MINUS() != null) {
            ASTNode right = stack.pop();
            ASTNode left = stack.pop();
            String operation = ctx.ADD() != null ? "+" : "-";
            BinaryOpNode binOpNode = new BinaryOpNode(left, operation, right);
            stack.push(binOpNode);
        }
    }

    @Override
    public void exitMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx) {
        if (ctx.MUL() != null || ctx.DIV() != null) {
            ASTNode right = stack.pop();
            ASTNode left = stack.pop();
            String operation = ctx.MUL() != null ? "*" : "/";
            BinaryOpNode binOpNode = new BinaryOpNode(left, operation, right);
            stack.push(binOpNode);
        }
    }

    @Override
    public void exitAtomicExpr(SimpleExprParser.AtomicExprContext ctx) {
        if (ctx.INT() != null) {
            ASTNode node = new IntLiteralNode(ctx.INT().getText());
            stack.push(node);
        } else if (ctx.FLOAT() != null) {
            ASTNode node = new FloatLiteralNode(ctx.FLOAT().getText());
            stack.push(node);
        } else if (ctx.ID() != null) {
            ASTNode node = new IdentifierNode(ctx.ID().getText());
            stack.push(node);
        }
    }

}