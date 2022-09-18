from typing import Any
from node import Node
class Queue:
    def __init__(self) -> None:
        self.__rear:Node =None
        self.__front:Node =None
        self.__length = 0
        
    def isEmpty(self)->bool:
        return self.__length == 0
    
    def enqueue(self, value)->None:
        newNode = Node(item=value);
        if(self.isEmpty()):
            self.__front = self.__rear = newNode
        else:
            self.__rear.next = newNode
            self.__rear = newNode
        
        self.__length += 1
        
    def dequeue(self)->Any:
        if(self.isEmpty()): raise Exception("Queue is Empty")
        temp = self.__front
        self.__front = self.__front.next
        self.__length -= 1
        return temp.item
    
    def getFront(self)->Any:
        return self.__front.item
    
    def getRear(self)-> Any:
        return self.__rear.item
    
    def getSize(self)->int:
        return self.__length
    
    def clear(self)->None:
        self.__front = None
        self.__rear = None
    
    def display(self)->None:
        temp = self.__front
        print("[", end="")
        while(temp != None):
            
            print(temp.item, end="")
            temp = temp.next
            print(", " if(temp != None) else"", end="")
        print("]")