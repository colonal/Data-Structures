import sys
sys.path.insert(0,'../../../Linked Stack/python')
from stack import Stack
class BalancedParentheses:
    def __init__(self) -> None:
        self.stack = Stack()
        self.left = ["{","[","("]
        self.right = ["}","]",")"]
        
    def areBalanced(self, data:str)->bool:
        for i in data:
            if i in self.left:
                self.stack.push(i)
                
            elif i in self.right:
                if(not self.stack.isEmpty() and self.right.count(i) == self.left.count(str(self.stack.getTop()))):
                    self.stack.pop()
                else:
                    return False
        return self.stack.isEmpty()