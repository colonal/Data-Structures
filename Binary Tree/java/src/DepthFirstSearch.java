public class DepthFirstSearch<T> {
    Node<T> tree;

    DepthFirstSearch(Node<T> tree) {
        this.tree = tree;
    }

    private void inOrder(Node<T> tree) {
        if (tree == null)
            return;
        inOrder(tree.left);
        System.out.print(tree.value + ",");
        inOrder(tree.right);
    }

    void displayInOrder() {
        System.out.print("[");
        inOrder(tree);
        System.out.println("]");
    }

    private void preOrder(Node<T> tree) {
        if (tree == null)
            return;
        System.out.print(tree.value + ",");
        preOrder(tree.left);
        preOrder(tree.right);
    }

    void displayPreOrder() {
        System.out.print("[");
        preOrder(tree);
        System.out.println("]");
    }

    private void postOrder(Node<T> tree) {
        if (tree == null)
            return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.value + ",");
    }

    void displayPostOrder() {
        System.out.print("[");
        postOrder(tree);
        System.out.println("]");
    }

}
