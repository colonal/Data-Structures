public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.stackTop());
    }
}
