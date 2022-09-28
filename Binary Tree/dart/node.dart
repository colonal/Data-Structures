class Node<T> {
  Node<T>? left;
  Node<T>? right;
  T? value;
  Node(T? value) {
    this.value = value;
    left = null;
    right = null;
  }
}
