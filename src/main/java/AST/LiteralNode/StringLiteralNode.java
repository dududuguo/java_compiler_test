package AST.LiteralNode;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

// StringLiteralNode 定义, 继承 CharLiterNode
// 实际上是一个char数组
@Getter
@Setter
public class StringLiteralNode extends CharLiterNode implements Array<Character> {
    private int offset;
    private int size;
    private ArrayList<Character> stringList=new ArrayList<>();
    private String Name;

    @Override
    public void addChar(Character node) {
        stringList.add(node);
    }

    @Override
    public void addChars(Character[] nodes) {
        stringList.addAll(Arrays.asList(nodes));
    }

    public Character get(int index){
        return stringList.get(index);
    }

    public StringLiteralNode(String Name) {
        super(Name);
    }


    // 打印char数组
    public void print() {
        for(Character node : stringList){
            System.out.println(node);
        }
    }

    public int getSize() {
        return stringList.size();
    }

    @Override
    public boolean isEmpty() {
        return stringList.isEmpty();
    }

    @Override
    public void clear() {
        stringList.clear();
    }

    @Override
    public boolean contains(Character o) {
        return stringList.contains(o);
    }

    @Override
    public int indexOf(Character o) {
        return stringList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Character o) {
        return 0;
    }

    @Override
    public Character[] toArray() {
        return stringList.toArray(new Character[0]);
    }
}
