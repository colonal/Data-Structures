from BalancedParentheses import BalancedParentheses

data = input("Enter an expression: ")
balancedParentheses = BalancedParentheses()
print("Balanced" if balancedParentheses.areBalanced(data) else "Not Balanced")