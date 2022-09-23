import 'dart:io';

class BubbleSort {
  List? _arr;

  BubbleSort({List? arr}) {
    _arr = arr;
  }

  void sort({List? arr}) {
    if (arr != null) _arr = arr;

    for (int i = 0; i < _arr!.length - 1; i++) {
      for (int j = 0; j < _arr!.length - i - 1; j++) {
        if (_arr![j] > _arr![j + 1]) {
          _swap(j, j + 1);
        }
      }
    }
  }

  void _swap(int j, int i) {
    int temp = _arr![j];
    _arr![j] = _arr![i];
    _arr![i] = temp;
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
