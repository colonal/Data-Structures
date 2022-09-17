public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        System.out.println(queue.getSize());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(35);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        System.out.println(queue.getSize());
        
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println(queue.search(60));
    }
}
