import 'dart:io';

class SelectionSort {
  List? _arr;
  SelectionSort({List? arr}) {
    if (arr != null) _arr = arr;
  }
  void sort({List? arr}) {
    if (arr != null) _arr = arr;
    for (int i = 0; i < _arr!.length; i++) {
      int min = i;
      for (int j = i; j < _arr!.length; j++) {
        if (_arr![min] > _arr![j]) {
          min = j;
        }
      }
      swap(i, min);
    }
  }

  void swap(int i, int min) {
    int temp = _arr![i];
    _arr![i] = _arr![min];
    _arr![min] = temp;
  }

  void display() {
    if (_arr != null) {
      stdout.write("[");
      for (int i = 0; i < _arr!.length; i++) {
        stdout.write('${_arr![i]}${i < _arr!.length - 1 ? ", " : ""}');
      }
      print("]");
    }
  }
}
