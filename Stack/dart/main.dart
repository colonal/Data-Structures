import 'stack.dart';

void main(List<String> args) {
  Stack stack = Stack(MAX_SIZE: 3);
  stack.push(5);
  stack.push(9);
  stack.push(10);
  stack.printStack();
  print(stack.getTop());
  stack.pop();
  stack.pop();
  stack.pop();
  print(stack.isEmpty());
}
