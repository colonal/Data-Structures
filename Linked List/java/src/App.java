public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(15);
        linkedList.insert(25);
        linkedList.insert(4, 20);
        linkedList.display();

        System.out.println(linkedList.pop());

        linkedList.display();
        linkedList.reverse();
        linkedList.display();
        System.out.println(linkedList.search(25));
        ;
    }
}
