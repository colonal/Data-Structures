import 'dart:io';

class Queue<T> {
  late int _rear;
  late int _front;
  late int _count;

  late List<T?> _array;
  late int _MAX_SIZE;

  Queue({int MAX_SIZE = 5}) {
    _MAX_SIZE = MAX_SIZE;
    _array = List.generate(MAX_SIZE, (index) => null);

    _rear = MAX_SIZE - 1;
    _front = 0;
    _count = 0;
  }
  bool isEmpty() {
    return _count == 0;
  }

  bool isFull() {
    return _count == _MAX_SIZE;
  }

  void enqueue(T value) {
    if (isFull()) throw Exception("Queue is Full");
    _rear = (_rear + 1) % _MAX_SIZE;
    _array[_rear] = value;
    ++_count;
  }

  void dequeue() {
    if (isEmpty()) throw Exception("Queue is Empty");
    _array[_front] = null;
    _front = (_front + 1) % _MAX_SIZE;
    --_count;
  }

  T getFront() {
    if (isEmpty()) throw Exception("Queue is Empty");
    return _array[_front]!;
  }

  T getRear() {
    return _array[_rear]!;
  }

  int getSize() {
    return _count;
  }

  void clear() {
    _array.clear();
  }

  void display() {
    if (isEmpty()) throw Exception("Queue is Empty");
    stdout.write("[");
    for (int i = _front; i != _rear; i = (i + 1) % _MAX_SIZE) {
      stdout.write("${_array[i]} ,");
    }
    print("${_array[_rear]}]");
  }

  int search(T value) {
    if (isEmpty()) throw Exception("Queue is Empty");

    int pos = -1;
    for (int i = _front; i != _rear; i = (i + 1) % _MAX_SIZE) {
      if (_array[i] == value) {
        pos = i;
        break;
      }
    }

    if (pos == -1 && _array[_rear] == value) {
      pos = _rear;
    }

    return pos;
  }
}
