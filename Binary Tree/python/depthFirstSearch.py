from node import Node
class DepthFirstSearch:
    def __init__(self, root:Node) -> None:
        self.__root = root
    
    def __inOrder(self, root:Node) ->None:
        if(root ==None):
            return
        
        self.__inOrder(root.left)
        print(root.value, end=",")
        self.__inOrder(root.right)
        
    def displayInOrder(self) -> None:
        print("[", end="")
        self.__inOrder(self.__root)
        print("]")
        
    def __preOredr(self,root:Node) ->None:
        if(root == None):
            return
        
        print(root.value, end=",")
        self.__preOredr(root.left)
        self.__preOredr(root.right)
        
    def displayPreOrder(self) -> None:
        print("[", end="")
        self.__preOredr(self.__root)
        print("]")
        
    def __postOrder(self, root:Node) ->None:
        if(root == None):
            None
            
        self.__postOrder(root.left)
        self.__postOrder(root.right)
        print(root.value, ",")
    
    def displayPostOrder(self) -> None:
        print("[", end="")
        self.__postOrder(self.__root)
        print("]")
        
        
        
    