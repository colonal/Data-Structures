from stack import Stack

stack = Stack(MAX_EMAX=3)

stack.push("A")
stack.push("B")
stack.push("C")
stack.printStack()
print(stack.pop())
print(stack.pop())
print(stack.pop())
print(stack.isEmpty())
