import 'node.dart';
import "../../Queue/dart/queue.dart";
import 'depth_first_search.dart';
import '../../Stack/dart/stack.dart';

class BinaryTree<T> {
  Node<T>? root;
  BinaryTree() {
    root = null;
  }

  void insert(T value) {
    Node<T> newNode = Node(value);
    if (root == null) {
      root = newNode;
      return;
    }

    Queue<Node<T>> queue = Queue<Node<T>>();

    Node<T> temp = root!;

    queue.enqueue(temp);

    while (!queue.isEmpty()) {
      temp = queue.getFront();
      queue.dequeue();

      if (temp.left == null) {
        temp.left = newNode;
        return;
      } else {
        queue.enqueue(temp.left!);
      }

      if (temp.right == null) {
        temp.right = newNode;
        return;
      } else {
        queue.enqueue(temp.right!);
      }
    }
  }

  void inOrder() {
    DepthFirstSearch<T>(root!).displayInOrder();
  }

  void preOrder() {
    DepthFirstSearch<T>(root!).displayPreOrder();
  }

  void postOrder() {
    DepthFirstSearch<T>(root!).displayPostOrder();
  }

  void remove(T value) {
    if (root == null) return;

    if (root!.left == null && root!.right == null) {
      if (root!.value == value) {
        root = null;
        return;
      } else
        return;
    }

    Queue<Node<T>> queue = Queue<Node<T>>();

    Node<T> temp = root!;
    Node<T>? keyNode = null;

    queue.enqueue(temp);

    while (!queue.isEmpty()) {
      temp = queue.getFront();
      queue.dequeue();

      if (temp.value == value) {
        keyNode = temp;
      }
      if (temp.left != null) {
        queue.enqueue(temp.left!);
      }
      if (temp.right != null) {
        queue.enqueue(temp.right!);
      }
    }

    if (keyNode != null) {
      keyNode.value = temp.value;
      _deleteNode(temp);
    }
  }

  void _deleteNode(Node<T> delNode) {
    Stack stack = Stack();

    Node<T> temp = root!;
    Node<T>? parint = null;
    stack.push(temp);

    while (!stack.isEmpty()) {
      parint = temp;
      temp = stack.pop();

      if (temp == delNode) {
        if (parint.left != null && parint.left == delNode) {
          parint.left = null;

          return;
        }
        parint.right = null;
        return;
      }

      if (temp.left != null) {
        stack.push(temp.left);
      }
      if (temp.right != null) {
        stack.push(temp.right);
      }
    }
  }
}
