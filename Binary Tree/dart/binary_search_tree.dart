import 'dart:io';

import '../../Queue/dart/queue.dart';
import 'depth_first_search.dart';
import 'node.dart';

class BinarySearchTree {
  Node<int>? root;

  BinarySearchTree() {
    root = null;
  }

  Node<int> _addRecursive(Node<int>? root, int value) {
    if (root == null) {
      return Node(value);
    }

    if (root.value! > value) {
      root.left = _addRecursive(root.left, value);
    } else if (root.value! < value) {
      root.right = _addRecursive(root.right, value);
    }

    return root;
  }

  void add(int value) {
    root = _addRecursive(root, value);
  }

  bool _containsNodeRecursive(Node<int>? current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.value) {
      return true;
    }
    return value < current.value!
        ? _containsNodeRecursive(current.left!, value)
        : _containsNodeRecursive(current.right!, value);
  }

  bool search(int value) {
    return _containsNodeRecursive(root, value);
  }

  void inOrder() {
    DepthFirstSearch(root!).displayInOrder();
  }

  void preOrder() {
    DepthFirstSearch(root).displayPreOrder();
  }

  void postOrder() {
    DepthFirstSearch(root!).displayPostOrder();
  }

  void breadthFirstSearch() {
    if (root == null) {
      return;
    }
    Queue<Node<int>> nodes = new Queue();

    Node<int> temp = root!;

    nodes.enqueue(temp);

    stdout.write("[");
    while (!nodes.isEmpty()) {
      temp = nodes.getFront();
      nodes.dequeue();

      stdout.write(temp.value);
      stdout.write(",");

      if (temp.left != null) {
        nodes.enqueue(temp.left!);
      }

      if (temp.right != null) {
        nodes.enqueue(temp.right!);
      }
    }
    stdout.writeln("]");
  }

  void remove(int value) {
    root = _deleteRecursive(root, value);
  }

  Node<int>? _deleteRecursive(Node<int>? current, int value) {
    if (current == null) {
      return null;
    }

    if (value == current.value) {
      current = _deleteNode(current);
      return current;
    }
    if (value < current.value!) {
      current.left = _deleteRecursive(current.left, value);
      return current;
    }
    current.right = _deleteRecursive(current.right, value);
    return current;
  }

  Node<int>? _deleteNode(Node<int> current) {
    //  a node has no children
    if (current.left == null && current.right == null) {
      return null;
    }
    //  a node has exactly one child
    if (current.right == null) {
      return current.left;
    }

    if (current.left == null) {
      return current.right;
    }

    //  a node has two children
    int smallestValue = _findSmallestValue(current.right!);
    current.value = smallestValue;
    current.right = _deleteRecursive(current.right, smallestValue);
    return current;
  }

  int _findSmallestValue(Node root) {
    return root.left == null ? root.value : _findSmallestValue(root.left!);
  }
}
