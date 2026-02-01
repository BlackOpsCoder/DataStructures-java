import java.util.ArrayList;

public class Stack {
    public static void main(String[] args) {

    }
    private ArrayList<Integer> items;

    public Stack() {
        this.items = new ArrayList<>();
    }
    public void push(Integer item) {
        this.items.add(item);
    }
    public void pop() {
        this.items.remove(this.items.indexOf(this.items.getLast()));
    }
    public int peek() {
        return this.items.getLast();
    }
    public boolean isEmpty() {
        return this.items.size() == 0;
    }
    public ArrayList<Integer> getStack() {
        return this.items;
    }

}