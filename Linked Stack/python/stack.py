from node import Node
class Stack:
    def __init__(self) -> None:
        self.stackTop:Node = None
        
    def push(self, item):
        temp = Node()
        temp.item = item
        temp.next = self.stackTop
        self.stackTop = temp
    
    def pop(self):
        if(self.isEmpty()): raise Exception("Stack is Empty")
        temp = self.stackTop
        item = temp.item
        self.stackTop = temp.next
        del temp
        return item
    
    def display(self):
        temp = self.stackTop
        print("[", end="")
        while (temp != None):
            print(temp.item, end="")
            temp = temp.next
            print(","if temp != None else "", end="")
        print("]")
    
    def getTop(self):
        if(self.isEmpty()): raise Exception("Stack is Empty")
        return self.stackTop.item
    
    def isEmpty(self):
        return self.stackTop == None