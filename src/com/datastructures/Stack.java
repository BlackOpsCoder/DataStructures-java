package src.com.datastructures;
import java.util.List;
import java.util.ArrayList;


public class Stack<T> {
    public static void main(String[] args) {
        
    }
    private List<T> items = new ArrayList<>();

    public Stack() {
        this.items = new ArrayList<>();
    }
    public void push(T item) {
        this.items.add(item);
    }
    public void pop() {
        this.items.remove(this.items.indexOf(this.items.getLast()));
    }
    public T peek() {
        return this.items.getLast();
    }
    public boolean isEmpty() {
        return this.items.size() == 0;
    }
    public List<T> getStack() {
        return this.items;
    }

}