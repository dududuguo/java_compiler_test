import ANTLR_code.SimpleExprLexer;
import ANTLR_code.SimpleExprParser;
import AST.ASTConstructorListener;
import AST.ASTNode;
import assembly.AssemblyGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SimpleExprTest {
    public static void main(String[] args) throws Exception {
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
        SimpleExprParser parser = new SimpleExprParser(tokens);
        ParseTree tree = parser.prog();


        // 2. Construct AST from the parse tree
        ASTConstructorListener astConstructor = new ASTConstructorListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astConstructor, tree);
        ASTNode ast = astConstructor.getAST();
        System.out.println("ast = " + Arrays.toString(ast.getChildren()));

        // 3. Generate assembly code from AST
        AssemblyGenerator generator = new AssemblyGenerator();
        String headers = generator.generateInitialAssemblyHeaders();
        int localVariablesSpace = astConstructor.getSymbolTable().getSymbols().size() * 8;  // Calculate space based on number of variables
        String prologue = generator.generateFunctionPrologue(localVariablesSpace);
        String body = generator.generateFromAST(ast);
        String epilogue = generator.generateFunctionEpilogue();
        String returnStatement = generator.generateReturnStatement();
        String assemblyCode = headers + prologue + body + returnStatement + epilogue;


        // write to file
        String program = "program";
        String fileName = program + ".s";
        writeToFile(fileName, assemblyCode);
        System.out.println("Writing to " + fileName);

        // 4. Print the generated assembly code
        System.out.println(assemblyCode);
    }

    private static void writeToFile(String fileName, String assemblyCode) {
        try {
            PrintWriter writer = new PrintWriter(fileName, StandardCharsets.UTF_8);
            writer.println(".file \t\"" + fileName + "\"");
            writer.println(assemblyCode);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
