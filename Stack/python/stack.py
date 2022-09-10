from array import array
from typing import Any, List


class Stack():
    
    
    def __init__(self, MAX_EMAX = 5) -> None:
        self._MAX_SIZE = MAX_EMAX
        self._stack = [None for a in range(MAX_EMAX)]
        self._top = -1
        
    def push(self, val):
        
        if(self._MAX_SIZE-1  == self._top):raise  Exception("Stack is Full")
        self._top += 1
        self._stack[self._top] = val;
        
    def pop(self) -> Any:
        if(self.isEmpty()):raise  Exception("Stack is Empty")
        val = self._stack[self._top]
        self._top -=1
        return  val
    def getTop(self):
        return self._stack[self._top]
    
    def printStack(self):
        print("[", end="")
        for i in range(self._top+1):
            print(f"{self._stack[self._top-i]}{'' if self._top == 0 else ','}", end="")
            
        print("]", end="\n")
        
        
    def isEmpty(self) -> bool:
        return self._top == -1
        
        