public class BubbleSort {
    private int[] arr;

    BubbleSort() {
    }

    BubbleSort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        for (int i = 0; arr.length - 1 > i; i++) {

            for (int j = 0; arr.length - i - 1 > j; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    void sort(int[] arr) {
        this.arr = arr;
        sort();
    }

    private void swap(int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void display() {
        if (arr != null) {

            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : ""));
            }
            System.out.println("]");
        }
    }

}
