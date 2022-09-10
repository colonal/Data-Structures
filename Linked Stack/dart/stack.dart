import 'dart:io';

import 'node.dart';

class Stack<T> {
  Node? stackTop;
  Stack() {
    stackTop = null;
  }

  void push(dynamic itme) {
    Node node = Node();
    node.itme = itme;
    node.next = stackTop;
    stackTop = node;
  }

  dynamic pop() {
    if (isEmpty()) throw Exception("Stack is Empty");
    Node? temp = stackTop!;
    dynamic itme = temp.itme;
    stackTop = null;
    stackTop = temp.next;
    temp = null;
    return itme;
  }

  dynamic getTop() {
    if (isEmpty()) throw Exception("Stack is Empty");
    return stackTop?.itme;
  }

  void display() {
    Node? temp = stackTop;

    stdout.write("[");
    while (temp != null) {
      stdout.write("${temp.itme}");
      temp = temp.next;
      stdout.write("${temp == null ? "" : ","}");
    }
    stdout.writeln("]");
  }

  bool isEmpty() {
    return stackTop == null;
  }
}
