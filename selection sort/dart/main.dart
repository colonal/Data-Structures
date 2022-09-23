import 'selection_sort.dart';

void main(List<String> args) {
  SelectionSort selectionSort = SelectionSort(arr: [4, 3, 2, 1]);
  selectionSort.display();
  selectionSort.sort();
  selectionSort.display();
}
