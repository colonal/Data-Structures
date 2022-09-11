import '../../../Linked Stack/dart/stack.dart';

class BalancedParentheses {
  late Stack stack;
  late List<String> left;
  late List<String> right;
  BalancedParentheses() {
    stack = Stack<String>();
    left = ["{", "[", "("];
    right = ["}", "]", ")"];
  }
  bool areBalanced(String data) {
    for (int i = 0; i < data.length; i++) {
      if (left.contains(data[i])) {
        stack.push(data[i]);
      } else if (right.contains(data[i])) {
        if (!stack.isEmpty() &&
            left.indexOf(stack.getTop()) == right.indexOf(data[i])) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
