package AST;

import ANTLR_code.SimpleExprBaseListener;
import ANTLR_code.SimpleExprParser;
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
        String varType = ctx.type().getText();  // Assuming you have a 'type' rule in your grammar
        Symbol symbol = new Symbol(varName, varType, "global");  // Assuming global scope for simplicity
        symbolTable.addSymbol(symbol);
    }

    @Override
    public void enterExpr(SimpleExprParser.ExprContext ctx) {
        if (ctx.ADD() != null || ctx.MINUS() != null) {
            BinaryExpr node = new BinaryExpr(null, ctx.ADD() != null ? "+" : "-", null);
            stack.push(node);
        }
    }

    @Override
    public void enterMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx) {
        if (ctx.MUL() != null || ctx.DIV() != null) {
            BinaryExpr node = new BinaryExpr(null, ctx.MUL() != null ? "*" : "/", null);
            stack.push(node);
        }
    }

    @Override
    public void exitExpr(SimpleExprParser.ExprContext ctx) {
        if (ctx.ADD() != null || ctx.MINUS() != null) {
            BinaryExpr node = new BinaryExpr(null, ctx.ADD() != null ? "+" : "-", null);
            node.setRight(stack.pop());
            node.setLeft(stack.pop());
            stack.push(node);
        }
    }

    @Override
    public void exitMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx) {
        if (ctx.MUL() != null || ctx.DIV() != null) {
            BinaryExpr node = new BinaryExpr(null, ctx.MUL() != null ? "*" : "/", null);
            node.setRight(stack.pop());
            node.setLeft(stack.pop());
            stack.push(node);
        }
    }

    @Override
    public void exitAtomicExpr(SimpleExprParser.AtomicExprContext ctx) {
        AtomExpr node;
        if (ctx.getText().matches("\\d+")) {
            node = new AtomExpr(Integer.parseInt(ctx.getText()));
        } else {
            node = new AtomExpr(ctx.getText());
        }
        stack.push(node);
    }

    @Override
    public void exitProg(SimpleExprParser.ProgContext ctx) {
        root = stack.pop();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}