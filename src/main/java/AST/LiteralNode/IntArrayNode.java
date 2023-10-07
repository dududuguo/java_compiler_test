package AST.LiteralNode;

public class IntArrayNode extends IntLiteralNode{
    String VarName;

    int Value;
    final int offset = 32;
    final int size = 4;
    String type = "int";

    public IntArrayNode(String Name) {
        super(Name);
        VarName = Name;
    }
}
