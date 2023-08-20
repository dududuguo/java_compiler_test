import ANTLR_code.SimpleExprLexer;
import AST.ASTConstructorListener;
import AST.ASTNode;
import Symbol_Table.Symbol;
import Symbol_Table.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import ANTLR_code.SimpleExprParser;

public class SimpleExprTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Loading");
        InputStream is = System.in;
        String file;
        if (args.length > 0) {
            file = args[0];
            is = new FileInputStream(file);
        }

        CharStream input = CharStreams.fromStream(is);

        // 1. Parse the source code with ANTLR to get a parse tree
        SimpleExprLexer lexer = new SimpleExprLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleExprParser parser;
        parser = new SimpleExprParser(tokens);

        parser.removeErrorListeners(); // remove default error listener
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            }
        });


        ParseTree parseTree = parser.prog();

        // 2. Construct the AST using a listener
        ASTConstructorListener astConstructor = new ASTConstructorListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astConstructor, parseTree);

        // 3. Print the AST
        ASTNode ast = astConstructor.getAST();
        //ast.print(0);

        System.out.println("Symbol Table:");
        var symbolTable = astConstructor.getSymbolTable();
        for (String varName : symbolTable.getAllSymbols().keySet()) {
            Symbol symbol = symbolTable.getSymbol(varName);
            System.out.println("Name: " + symbol.getName() + ", Type: " + symbol.getType());
        }
    }
}
