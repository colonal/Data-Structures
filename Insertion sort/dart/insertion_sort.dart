import 'dart:io';

class InsertionSort {
  List? arr;
  InsertionSort({List? arr}) {
    this.arr = arr;
  }

  void sort({List? arr}) {
    if (arr != null) arr = arr;

    late int key, j;

    for (int i = 1; i < this.arr!.length; i++) {
      key = this.arr![i];
      j = i - 1;

      while (j >= 0 && this.arr![j] > key) {
        this.arr![j + 1] = this.arr![j];
        --j;
      }
      this.arr![j + 1] = key;
    }
  }

  void display() {
    if (arr != null) {
      stdout.write("[");
      for (int i = 0; i < arr!.length; i++) {
        stdout.write('${arr![i]}${i < arr!.length - 1 ? ", " : ""}');
      }
      print("]");
    }
  }
}
