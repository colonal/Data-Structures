import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTrees {
    Node<Integer> root;

    BinarySearchTrees() {
        root = null;
    }

    private Node<Integer> addRecursive(Node<Integer> current, int value) {

        if (current == null) {

            return new Node<Integer>(value);
        }

        if (current.value > value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;

    }

    void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node<Integer> current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    Boolean search(int value) {

        return containsNodeRecursive(root, value);
    }

    void inOrder() {
        new DepthFirstSearch<Integer>(root).displayInOrder();
    }

    void preOrder() {
        new DepthFirstSearch<Integer>(root).displayPreOrder();
    }

    void postOrder() {
        new DepthFirstSearch<Integer>(root).displayPostOrder();
    }

    void breadthFirstSearch() {
        if (root == null) {
            return;
        }
        Queue<Node<Integer>> nodes = new LinkedList<>();

        Node<Integer> temp = root;

        nodes.add(temp);

        System.out.print("[");
        while (!nodes.isEmpty()) {
            temp = nodes.remove();

            System.out.print(temp.value + ",");

            if (temp.left != null) {
                nodes.add(temp.left);
            }

            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        System.out.println("]");
    }

    public void remove(int value) {
        root = deleteRecursive(root, value);
    }

    private Node<Integer> deleteRecursive(Node<Integer> current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            current = deleteNode(current);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private Node<Integer> deleteNode(Node<Integer> current) {
        // a node has no children
        if (current.left == null && current.right == null) {
            return null;
        }
        // a node has exactly one child
        if (current.right == null) {
            return current.left;
        }

        if (current.left == null) {
            return current.right;
        }

        // a node has two children
        int smallestValue = findSmallestValue(current.right);
        current.value = smallestValue;
        current.right = deleteRecursive(current.right, smallestValue);
        return current;

    }

    private int findSmallestValue(Node<Integer> root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

}
