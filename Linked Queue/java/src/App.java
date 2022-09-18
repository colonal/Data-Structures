public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        System.out.println(queue.getSize());
        queue.desplay();
        queue.dequeue();
        queue.desplay();

    }
}
