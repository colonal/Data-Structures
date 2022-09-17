class ExpressionEvaluation {
    private String infix;

    private int op1;
    private int op2;

    ExpressionEvaluation() {

    }

    ExpressionEvaluation(String infix) {
        this.infix = infix;

    }

    String infixToPostfix() {
        return _infixToPostfix(this.infix);
    }
    String infixToPostfix(String infix) {
        return _infixToPostfix(infix);
    }

    private String  _infixToPostfix(String infix){
        Stack<Character> stack = new Stack<>();
        char[] postfix = new char[infix.length()];
        int i;
        int ponter = 0;
        for (i = 0; i < infix.length(); ++i) {

            char character = infix.charAt(i);
            if ((int) character >= 48 && (int) character <= 57) {
                postfix[ponter++] = infix.charAt(i);

            } else {
                if (character == '(') {
                    stack.push(character);
                } else if (character == ')') {
                    while (!stack.isEmpty() && stack.stackTop() != '(') {
                        postfix[ponter++] = stack.pop();
                    }
                    stack.pop(); 
                }
                else{
                    if (stack.isEmpty() || hasHigherPrecedence(character, stack.stackTop())) {

                        stack.push(character);
                    } else {
                        postfix[ponter++] = stack.pop();
                        stack.push(character);
    
                    }
                }
            }

        }

        while (!stack.isEmpty()) {
            postfix[ponter++] = stack.pop();
        }

        return new String(postfix);
    }

    private int getOperatorWeight(char op) {
        int weight = -1;
        switch (op) {
            case '+':
            case '-':
                weight = 1;
                break;
            case '*':
            case '/':
                weight = 2;
        }
        return weight;
    }

    private boolean hasHigherPrecedence(char op1, char op2) {
        return getOperatorWeight(op1) > getOperatorWeight(op2);
    }

    int expressionToPostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        postfix = postfix.trim();
        for (int i = 0; i < postfix.length(); ++i) {
            if(String.valueOf(postfix.charAt(i)).isEmpty()) continue;
            try {
                
                int num = Integer.parseInt(String.valueOf(postfix.charAt(i)));
                
                stack.push(num);
            } catch (Exception e) {
                
                char operator = postfix.charAt(i);
                op1 = stack.pop();
                op2 = stack.pop();
               
                stack.push(appliesTheArithmetic(operator, op1, op2));
                
            }
        }
        
        return stack.stackTop();
    }

    private int appliesTheArithmetic(char operator, int _op1, int _op2) {

        if (operator == '+') {
            return _op2 + _op1;
        } else if (operator == '-') {
            return _op2 - _op1;
        } else if (operator == '*') {
            return _op2 * _op1;
        } else if (operator == '/') {
            return _op2 / _op1;
        }

        return 0;
    }

    void execute(){
        System.out.println(expressionToPostfix(infixToPostfix()));
    }
    void execute(String infix){
        System.out.println(expressionToPostfix(infixToPostfix(infix)));
    }
}