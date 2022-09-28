import 'node.dart';
import 'dart:io';

class DepthFirstSearch<T> {
  Node<T>? tree;

  DepthFirstSearch(Node<T>? tree) {
    this.tree = tree;
  }

  void inOrder(Node<T>? tree) {
    if (tree == null) return;
    inOrder(tree.left);

    stdout.write(tree.value);
    stdout.write(",");
    inOrder(tree.right);
  }

  void displayInOrder() {
    stdout.write("[");
    inOrder(tree);
    stdout.writeln("]");
  }

  void preOrder(Node<T>? tree) {
    if (tree == null) return;
    stdout.write(tree.value);
    stdout.write(",");
    preOrder(tree.left);
    preOrder(tree.right);
  }

  void displayPreOrder() {
    stdout.write("[");
    preOrder(tree);
    stdout.writeln("]");
  }

  void postOrder(Node<T>? tree) {
    if (tree == null) return;
    postOrder(tree.left);
    postOrder(tree.right);
    stdout.write(tree.value);
    stdout.write(",");
  }

  void displayPostOrder() {
    stdout.write("[");
    postOrder(tree);
    stdout.writeln("]");
  }
}
