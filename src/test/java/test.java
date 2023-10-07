import AST.LiteralNode.Array;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List list1=list;
        list1.add("aabb");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)+" "+list1.get(i).getClass());
        }
    }
}
