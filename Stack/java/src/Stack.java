public class Stack<T> {
    private Object[] stack ;
    private int top ;
    private  int MAX_SIZE = 5;

    Stack(){
        top = -1;
        stack =   new Object[MAX_SIZE];
    }
    Stack(int maxSize){
        top = -1;
        MAX_SIZE = maxSize;
        stack =  new Object[MAX_SIZE];
        
    }

    public void push(T val) {
        if(top == MAX_SIZE-1){
            throw new NullPointerException("Stak is Full");

        }
        stack[++top] = val;
    }

    public void pop() {
        if(isEmpty()) throw new NullPointerException("Stak is Empty");
        --top;
    }

    public T getTop() {
        if(isEmpty()) throw new NullPointerException("Stak is Empty");
        @SuppressWarnings("unchecked")
        final T t =  (T) stack[top];
        return t;
         
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print(){
        System.out.print("[");
        for (int i = top; i>= 0 ; --i) {
            System.out.print(stack[i]+" ");
            System.out.print( i == 0?"":",");
        }
        System.out.print("]");
        System.out.println();
    }
}
