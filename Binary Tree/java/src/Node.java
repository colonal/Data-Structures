public class Node<T> {
    Node<T> left;
    Node<T> right;
    T value;
    Node(T value){
        this.value = value;
        left = right = null;
    }
}
