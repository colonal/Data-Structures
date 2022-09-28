from binaryTree  import BinaryTree
from binarySearchTrees import BinarySearchTrees

binaryTree = BinaryTree()

binaryTree.insert(1)
binaryTree.insert(2)
binaryTree.insert(3)
binaryTree.insert(4)
binaryTree.insert(5)
binaryTree.insert(6)

binaryTree.preOrder()
binaryTree.remove(2)
binaryTree.preOrder()

binarySearchTrees = BinarySearchTrees()

binarySearchTrees.insert(6)
binarySearchTrees.insert(4)
binarySearchTrees.insert(8)
binarySearchTrees.insert(3)
binarySearchTrees.insert(5)
binarySearchTrees.insert(7)
binarySearchTrees.insert(9)

# binarySearchTrees.preOrder()
# binarySearchTrees.remove(8)
# binarySearchTrees.preOrder()
binarySearchTrees.breadthFirstSearch()