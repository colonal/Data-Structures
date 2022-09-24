public class InsertionSort {

    int[] arr;

    InsertionSort() {
    }

    InsertionSort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    void sort(int[] arr) {
        this.arr = arr;
        sort();
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
