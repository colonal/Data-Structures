from node import Node
import sys
sys.path.insert(0,'../../Linked Stack/python')
from stack import Stack 

from queue import Queue
from typing import Any

from depthFirstSearch import DepthFirstSearch
class BinaryTree:
    def __init__(self) -> None:
        self.root:Node = None
        
    def insert(self, value:Any)->None:
        newNode = Node(value=value)
        if(self.root == None):
            self.root = newNode
            return
        q = Queue()
        temp:Node = self.root
        q.put(item=temp)
        
        while(not q.empty()):
            temp = q.get()
            if(temp.left == None):
                temp.left = newNode
                return
            else:
                q.put(temp.left)
            
            if(temp.right == None):
                temp.right = newNode
                return
            else:
                q.put(temp.right)
    
    def inOrder(self)-> None:
        DepthFirstSearch(self.root).displayInOrder()
                
    def preOrder(self) ->None:
        DepthFirstSearch(self.root).displayPreOrder()
        
    def postOrder(self) ->None:
        DepthFirstSearch(self.root).displayPostOrder()
    
    def remove(self, value:Any) ->None:
        if(self.root == None): return
        
        if(self.root.left == None and self.root.right == None):
            if(self.root.value == value):
                self.root = None
                
            return
        
        q:Queue = Queue()
        temp:Node = self.root
        q.put(temp)
        keyNode:Node = None
        
        while(not q.empty()):
            temp = q.get()
            
            if(temp.value == value):
                keyNode = temp
            
            if(temp.left != None):
                q.put(temp.left)
            if(temp.right != None):
                q.put(temp.right)
            
        if(keyNode != None):
            keyNode.value = temp.value
            self.__remove(temp)
            
    def __remove(self,delNode:Node) -> None:
       
        
        s = Stack()
        temp:Node = self.root
        s.push(item=temp)
        
        while(not s.isEmpty()):
            parint = temp;
            temp = s.pop()
            
            if(temp == delNode):
                if(parint.left != None and parint.left == delNode):
                    parint.left = None
                    return
                else:
                    parint.right =  None
                    return
            
            
            if(temp.left != None):
                s.push(temp.left)
            if(temp.right != None):
                s.push(temp.right)
            
            
    
        