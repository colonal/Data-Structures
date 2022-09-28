import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
    Node<T> tree;

    BinaryTree() {
        tree = null;
    }

    void insert(T value) {
        Node<T> newValue = new Node<T>(value);

        if (tree == null) {
            tree = newValue;
            return;
        }
        Queue<Node<T>> q = new LinkedList<Node<T>>();
        Node<T> temp = tree;
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.remove();

            if (temp.left == null) {
                temp.left = newValue;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newValue;
                return;
            } else {
                q.add(temp.right);
            }
        }

    }

    void inOrder(){
        new DepthFirstSearch<T>(tree).displayInOrder();
    }
    void preOrder(){
        new DepthFirstSearch<T>(tree).displayPreOrder();
    }
    void postOrder(){
        new DepthFirstSearch<T>(tree).displayPostOrder();
    }
    void remove(T value) {
        if (tree == null)
            return;

        if (tree.left == null &&
                tree.right == null) {
            if (tree.value == value) {
                tree = null;
                return;
            } else
                return;
        }
        Node<T> keyNode = null;
        Queue<Node<T>> q = new LinkedList<Node<T>>();
        Node<T> temp = tree;

        q.add(temp);

        while (!q.isEmpty()) {

            temp = q.remove();

            if (temp.value == value) {
                keyNode = temp;
            }

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null) {

            keyNode.value = temp.value;
            deleteNode(temp);
        }
    }

    private void deleteNode(Node<T> delNode) {
        Stack<Node<T>> q = new Stack<Node<T>>();
        Node<T> temp = tree;
        Node<T> parint = null;
        q.add(temp);
        while (!q.isEmpty()) {
            parint = temp;
            temp = q.pop();

            if (temp == delNode) {

                if (parint.left != null && parint.left == delNode) {
                    parint.left = null;

                    return;
                }
                parint.right = null;
                return;
            }

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

    }

    
}

