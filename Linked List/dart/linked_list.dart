import 'dart:io';
import 'node.dart';

class LinkedList<T> {
  Node<T>? _head;
  Node<T>? _tail;
  int length = 0;

  bool isEmpty() {
    return length == 0;
  }

  void append(T item) {
    Node<T> newNode = Node(item);
    if (isEmpty()) {
      _head = _tail = newNode;
    } else {
      _tail!.next = newNode;
      _tail = newNode;
    }

    ++length;
  }

  void insert(T item) {
    Node<T> newNode = Node(item);
    if (isEmpty()) {
      _head = _tail = newNode;
    } else {
      newNode.next = _head;
      _head = newNode;
    }

    ++length;
  }

  void insertOfIndex(int index, T item) {
    if (index < 0 || index > length) {
      throw Exception("length Out Of range");
    }
    if (index == length) {
      append(item);
      return;
    }
    if (index == 0) {
      insert(item);
      return;
    }

    Node<T>? curr = _head!;
    Node<T> newNode = Node(item);

    for (int i = 1; i < index; i++) {
      curr = curr!.next;
    }
    newNode.next = curr!.next;
    curr.next = newNode;
    ++length;
  }

  T remove() {
    if (isEmpty()) throw Exception("List is Empty");
    Node<T> temp = _head!;
    _head = _head!.next;

    if (_head == null) {
      _tail = null;
    }

    --length;
    return temp.item!;
  }

  int removeOf(T elemnt) {
    if (isEmpty()) throw Exception("List is Empty");

    if (_head!.item == elemnt) {
      remove();
    }

    int i = 0;
    Node<T>? temp = _head!.next;
    while (temp != null) {
      if (temp.item == elemnt) {
        removeOflength(++i);
        return i;
      }
      temp = temp.next;
      ++i;
    }
    throw Exception("$elemnt Not Found");
  }

  T removeOflength(int index) {
    if (isEmpty()) throw Exception("List is Empty");
    if (length == 0) return remove();
    if (index == length - 1) return pop();
    if (length == 1) {
      T item = _head!.item!;
      _head = null;
      _tail = null;
      return item;
    }
    Node<T> curr = _head!;
    for (int i = 1; i < index; i++) {
      curr = curr.next!;
    }

    curr.next = curr.next!.next!;
    --length;
    return curr.next!.item!;
  }

  T pop() {
    if (isEmpty()) throw Exception("List is Empty");
    if (length == 0) return remove();
    if (length == 1) {
      T item = _head!.item!;
      _head = null;
      _tail = null;
      return item;
    }
    Node<T>? curr = _head;
    while (curr!.next!.next != null) {
      curr = curr.next;
    }
    T item = curr.next!.item!;
    curr.next = null;
    _tail = curr;
    --length;
    return item;
  }

  void display() {
    Node<T>? temp = _head;
    stdout.write("[");
    while (temp != null) {
      stdout.write(temp.item);
      temp = temp.next;
      stdout.write(temp != null ? "," : "");
    }
    print("]");
  }
}
