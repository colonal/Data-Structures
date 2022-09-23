public class SelectionSort {
    private int[] arr;

    SelectionSort() {
    }

    SelectionSort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    void sort(int[] arr) {
        this.arr = arr;
        sort();
    }

    private void swap(int[] arr, int i, int j) {
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