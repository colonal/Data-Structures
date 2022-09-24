public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        InsertionSort insertionSort = new InsertionSort(new int[] {4,3,2,1});
        insertionSort.display();
        insertionSort.sort();
        insertionSort.display();
    }
}
