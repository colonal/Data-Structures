import 'dart:io';

class Stack {
  final int MAX_SIZE;
  late List _stack;
  late int top;

  Stack({this.MAX_SIZE = 5}) {
    top = -1;
    _stack = List.generate(MAX_SIZE, (index) => null);
  }

  void push(val) {
    if (top == MAX_SIZE - 1) throw Exception("Stak is Full");
    _stack[++top] = val;
  }

  dynamic pop() {
    if (isEmpty()) throw Expando("Stack is Empty");
    return _stack[top--];
  }

  dynamic getTop() {
    if (isEmpty()) throw Expando("Stack is Empty");
    return _stack[top];
  }

  void printStack() {
    stdout.write("[");
    for (int i = top; i >= 0; i--) {
      stdout.write("${_stack[i]} ${i == 0 ? "" : ","}");
    }
    print("]");
  }

  bool isEmpty() {
    return top == -1;
  }
}
