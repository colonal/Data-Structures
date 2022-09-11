import 'dart:io';
import 'balanced_parentheses.dart';

void main(List<String> args) {
  stdout.write("Enter an expression: ");
  String? data = stdin.readLineSync();
  BalancedParentheses balancedParentheses = BalancedParentheses();
  print(balancedParentheses.areBalanced(data ?? "")
      ? "Balanced"
      : "Not Balanced");
}
