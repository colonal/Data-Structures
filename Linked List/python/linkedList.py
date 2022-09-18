from os import remove
from typing import Any
from node import Node

class LinkedList:
    def __init__(self) -> None:
        self.head:Node = None
        self.tail:Node = None
        self.length:int = 0;
        
    def isEmpty(self)->bool:
        return self.length == 0;
    
    def append(self, item:Any)->None:
        newNode = Node(item=item)
        if(self.isEmpty()): self.head = self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1
        
    def insert(self,item:Any)->None:
        newNode = Node(item=item)
        if(self.isEmpty()): self.head = self.tail = newNode
        else:
            newNode.next = self.head
            self.head = newNode
        self.length += 1
    
    def insertOf(self, index:int, item:Any)->None:
        if(self.length == 0):
            self.append(item=item)
            return
        
        if(index == 0):
            self.insert(item=item)
            return
        
        curr = self.head
        newNode = Node(item=item)
        for _ in range(1,index):
            curr = curr.next
        
        newNode.next = curr.next
        curr.next = newNode
        self.length += 1
        
    def remove(self)->Any:
        if(self.isEmpty()): raise Exception("List is Empty")
        temp = self.head
        self.head = temp.next
        if(temp == None):
            self.tail = None
            
        self.length -= 1
        
        return temp.item 
    
    def removeOfIndex(self,index:int)->Any:   
        if(self.isEmpty()): raise Exception("List is Empty")
        if(self.length == 0): return self.remove()
        if(index == self.length-1): self.pop()
        if(self.length == 1):
            item:Any = self.head.item
            self.head = None
            self.tail = None
            return item
        curr = self.head
        for _ in range(1,index):
            curr = curr.next
        
        curr.next = curr.next.next
        self.length -= 1
        return curr.next.item;
    
    def removeOf(self, element:Any)->int:
        if(self.isEmpty()): raise Exception("List is Empty")
        if(self.head.item == element):
            remove()
            return 0;
        
        i = 0
        temp = self.head.next
        
        while(temp != None):
            if(temp.item == element):
                i += 1
                self.removeOfIndex(i)
                return i
            temp = temp.next
            i+= 1
    
    def pop(self)->Any:
        if(self.isEmpty()): raise Exception("List is Empty")
        if(self.length == 0): return self.remove()
        if(self.length == 1):
            item:Any = self.head.item
            self.head = None
            self.tail = None
            return item
        curr = self.head
        while(curr.next.next != None):
            curr = curr.next
            
        item:Any = curr.next.item
        self.tail = curr
        self.length -= 1
        return item
    
    def display(self)->Any:
        temp = self.head
        print("[", end="")
        for _ in range(self.length):
            print(temp.item, end="")
            temp = temp.next
            print("," if(temp != None) else ",",end=" ")
        print("]")
            
         
        
        