public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final Stack<String> stack = new Stack<>(3);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.print();
        System.out.println(stack.getTop());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
