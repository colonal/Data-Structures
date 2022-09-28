import 'binary_search_tree.dart';
import 'binary_tree.dart';

void main(List<String> args) {
  BinaryTree<int> binaryTree = BinaryTree();
  binaryTree.insert(1);
  binaryTree.insert(2);
  binaryTree.insert(3);
  binaryTree.insert(4);
  binaryTree.insert(5);
  binaryTree.insert(6);
  binaryTree.preOrder();
  binaryTree.remove(2);
  binaryTree.preOrder();

  BinarySearchTree binarySearchTree = BinarySearchTree();
  binarySearchTree.add(6);
  binarySearchTree.add(4);
  binarySearchTree.add(8);
  binarySearchTree.add(3);
  binarySearchTree.add(5);
  binarySearchTree.add(7);
  binarySearchTree.add(9);
  binarySearchTree.preOrder();
  binarySearchTree.remove(8);
  binarySearchTree.preOrder();
}
