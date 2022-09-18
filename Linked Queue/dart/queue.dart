import 'node.dart';
import 'dart:io';

class Queue<T> {
  late Node<T>? rear, front;
  int length = 0;

  bool isEmpty() {
    return length == 0;
  }

  void enqueue(T value) {
    Node<T> newNode = Node(item: value);

    if (isEmpty()) {
      rear = front = newNode;
    } else {
      rear!.next = newNode;
      rear = newNode;
    }

    ++length;
  }

  T dequeue() {
    if (isEmpty()) throw Exception("Queue is Empty");

    Node<T> temp = front!;
    front = temp.next!;
    --length;
    return temp.item!;
  }

  T getFront() {
    return front!.item!;
  }

  T getRear() {
    return rear!.item!;
  }

  int getSize() {
    return length;
  }

  void clear() {
    front = null;
    rear = null;
  }

  void display() {
    Node<T>? temp = front;
    stdout.write("[");
    while (temp != null) {
      stdout.write(temp.item);
      temp = temp.next;
      stdout.write(temp != null ? ", " : "");
    }
    print("]");
  }
}
