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
import soot.jimple.toolkits.callgraph.Edge;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SimpleExprTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Loading");
        InputStream is;
        String file;


        if (args.length > 0) {
            file = args[0];
            is = new FileInputStream(file);
        } else {
            System.out.println("Please input the file name");
            return;
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
        //System.out.println("ast = " + Arrays.toString(ast.getChildren()));
        System.out.println("ast length = " + ast.getChildren().length);

        // 3. Generate Graph from AST
        System.out.println(toDotFormat(ast));
        writeToFile("src\\main\\java\\sourceFile\\dotFiles\\ast.dot", toDotFormat(ast));
    }

    private static void writeToFile(String fileName, String Code) {
        Writer writer= null;
        File file = new File(fileName);
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), StandardCharsets.UTF_8));
            writer.write(Code);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String toDotFormat(ASTNode ast) {
        List<String> dotCode = traverseAst(ast, null, null);
        return String.join("\n", dotCode);
    }

    public static List<String> traverseAst(ASTNode node, String parentName, List<String> dotCode) {
        if (dotCode == null) {
            dotCode = new ArrayList<>();
            dotCode.add("digraph AST {");
            dotCode.add("    node [shape=box];");
        }

        // Check if node or its value is null
        if (node == null || node.getValue() == null) {
            return dotCode;
        }

        String nodeName = "node_"+node.getValue() + "_" + node.hashCode();

        // Add the node to the DOT code
        dotCode.add("    " + nodeName+ " [label=\"" + node.getValue() + "\"];");

        // Add an edge to its parent (if any)
        if (parentName != null) {
            dotCode.add("    " + parentName + " -> " + nodeName + ";");
        }

        // Recur for each child
        for (ASTNode child : node.getChildren()) {
            dotCode = traverseAst(child, nodeName, dotCode);
        }

        // If we are at the root, close the DOT code
        if (parentName == null) {
            dotCode.add("}");
        }
        return dotCode;
    }
}
