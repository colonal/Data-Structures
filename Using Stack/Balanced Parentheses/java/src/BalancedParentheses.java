
public class BalancedParentheses {
    private final Stack<Character> stack;
    private final char[] left = { '{', '(', '[' };
    private final char[] right = { '}', ')', ']' };

    BalancedParentheses() {
        stack = new Stack<Character>();
    }

    public boolean areBalanced(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (in(data.charAt(i), left)) {
                stack.push(data.charAt(i));

            } else if (in(data.charAt(i), right)) {

                if (!stack.isEmpty() && indexOf(data.charAt(i), right) == indexOf(stack.stackTop(), left)) {
                    stack.pop();

                } else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    private boolean in(char data, char[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (data == list[i])
                return true;
        }
        return false;
    }

    private int indexOf(char data, char[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (data == list[i])
                return i;
        }
        return -1;
    }

}
