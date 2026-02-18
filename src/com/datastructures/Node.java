package src.com.datastructures;

import javax.lang.model.type.NullType;

public class Node <T>{
    T data;
    Node<T> next;
    public static void main(String[] args) {

    }
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
