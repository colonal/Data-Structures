import 'stack.dart';

void main(List<String> args) {
  Stack stack = Stack();
  stack.push("A");
  stack.push("B");
  stack.push("C");
  stack.push("D");
  stack.display();
  stack.pop();
  stack.pop();
  print(stack.getTop());
  stack.pop();
  stack.pop();
  stack.display();
}
