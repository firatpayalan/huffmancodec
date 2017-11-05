package com.firat;

import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children
 * import java.util.List;
 * Node<String> parentNode = new Node<String>("Parent");
 * Node<String> childNode1 = new Node<String>("Child 1", parentNode);
 * Node<String> childNode2 = new Node<String>("Child 2");
 *
 * childNode2.setParent(parentNode);
 * Node<String> grandchildNode = new Node<String>("Grandchild of parentNode. Child of childNode1", childNode1);
 * List<Node<String>> childrenNodes = parentNode.getChildren();
 * @param <T>
 */
public class Node<T> {
    private List<Node<T>> children = new ArrayList<Node<T>>();
    private Node<T> parent=null;
    private T data =null;

    public void addChild(T data)
    {
        Node<T> child = new Node<T>(data);
        child.setParent(this);
        this.children.add(child);
    }
    public void addChild(Node<T> child)
    {
        child.setParent(this);
        this.children.add(child);
    }

    public boolean isRoot()
    {
        return this.parent ==null;
    }

    public boolean isLeaf()
    {
        if (this.children.size()==0)
            return true;
        else
            return false;
    }

    public void removeParent()
    {
        this.parent=null;
    }


    public Node(T data)
    {
        this.data=data;
    }
    public Node(T data,Node<T> parent)
    {
        this.data=data;
        this.parent=parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
