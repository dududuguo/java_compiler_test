package AST.LiteralNode;

import AST.ASTNode;

public interface Array<E>{
    public void print(int depth);
    public void addChar(E node);
    public void addChars(E[] nodes);
    public E get(int index);

    // delete, add, get, set, size, isEmpty, clear, contains, indexOf, lastIndexOf, toArray
    public int getSize();
    public boolean isEmpty();
    public void clear();
    public boolean contains(E e);
    public int indexOf(E e);
    public int lastIndexOf(E e);
    public E[] toArray();
}
