
from node import Node
from queue import Queue
from depthFirstSearch import DepthFirstSearch


class BinarySearchTrees:
    def __init__(self) -> None:
        self.root: Node = None

    def __insert(self, root: Node, value: int) -> Node:

        if (root == None):
            return Node(value=value)
        if (root.value > value):
            root.left = self.__insert(root.left, value)
        elif (value > root.value):
            root.right = self.__insert(root.right, value)

        return root

    def insert(self, value: int) -> None:
        self.root = self.__insert(self.root, value)

    def inOrder(self) -> None:
        DepthFirstSearch(self.root).displayInOrder()

    def preOrder(self) -> None:
        DepthFirstSearch(self.root).displayPreOrder()

    def postOrder(self) -> None:
        DepthFirstSearch(self.root).displayPostOrder()

    def search(self, value: int) -> bool:
        return self.__search(self.root, value)

    def __search(self, root: Node, value: int) -> bool:
        if (root == None):
            return False
        if (root.value == value):
            return True

        elif (root.value > value):
            return self.__search(root.left, value)

        else:
            return self.__search(root.right, value)

    def remove(self, value: int) -> None:
        self.root = self.__remove(self.root, value)

    def __remove(self, root: Node, value: int) -> Node:
        if (root == None):
            return None

        if (root.value == value):
            root = self.__deleteNode(root)

            return root
        elif (root.value > value):
            root.left = self.__remove(root.left, value)
            return root
        else:
            root.right = self.__remove(root.right, value)
            return root

    def __deleteNode(self, root: Node) -> Node:
        #  a node has no children
        if (root.left == None and root.right == None):

            return None

        #  a node has exactly one child
        elif (root.right == None):
            return root.left
        elif (root.left == None):
            return root.right

        #  a node has two children
        smallestValue = self.__findSmallestVale(root.right)
        root.value = smallestValue
        root.right = self.__remove(root.right, smallestValue)
        return root

    def __findSmallestVale(self, root: Node) -> int:
        return root.value if (root.left == None) else self.__findSmallestVale(root.left)

    def breadthFirstSearch(self)-> None:
        if(self.root == None):
            return
        
        q:Queue = Queue()
        
        temp:Node = self.root
        
        q.put(temp)
        
        print("[", end="")
        while(not q.empty()):
            temp = q.get()
            
            print(temp.value, end=",")
            
            if (temp.left != None):
                q.put(temp.left)
            
            if(temp.right != None):
                q.put(temp.right)
        print("]")