public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = new int[] { 1, 2, 3, 4 };
        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.display();
        selectionSort.sort();
        selectionSort.display();

    }
}
