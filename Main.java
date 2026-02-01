public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.getStack());
        stack.pop();
        System.out.println(stack.getStack());
        System.out.println(stack.isEmpty());
    }
}
