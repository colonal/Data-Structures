public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BubbleSort bubbleSort = new BubbleSort(new int[]{4,3,2,1});
        bubbleSort.display();
        bubbleSort.sort();
        bubbleSort.display();
    }
}
