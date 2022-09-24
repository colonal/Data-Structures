import 'insertion_sort.dart';

void main(List<String> args) {
  InsertionSort insertionSort = InsertionSort(arr: [4, 3, 2, 1]);
  insertionSort.display();
  insertionSort.sort();
  insertionSort.display();
}
