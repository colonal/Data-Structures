from stack import Stack

stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
stack.display()
stack.pop()
stack.pop()
print(stack.getTop())
stack.pop()
stack.display()