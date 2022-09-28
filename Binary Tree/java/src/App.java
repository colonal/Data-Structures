public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);

        binaryTree.preOrder();
        // binaryTree.remove(1);
        // binaryTree.preOrder();
        
        BinarySearchTrees binarySearchTrees = new  BinarySearchTrees();

        // binarySearchTrees.DepthFirstSearch()
        binarySearchTrees.add(6);
        binarySearchTrees.add(4);
        binarySearchTrees.add(8);
        binarySearchTrees.add(3);
        binarySearchTrees.add(5);
        binarySearchTrees.add(7);
        binarySearchTrees.add(9);
        binarySearchTrees.preOrder();
        binarySearchTrees.remove(8);
        binarySearchTrees.preOrder();
    }
}
