import static java.lang.System.exit;
public class Stack<T> {
    private Node<T> stackTop;

    Stack(){
        this.stackTop = null;
    }

    public void push(T itme){
        Node<T> node = new Node<T>();
        node.item = itme;
        node.next =  stackTop;
        stackTop = node;
    }

    public void display(){
        
        Node<T> node = stackTop;
        System.out.print("[");
        while (node != null){
            System.out.print(node.item );
            node = node.next;
            System.out.print( node != null?",":"");
        }
        System.out.println("]");
    }
    public T stackTop(){
        return stackTop.item;
    }

    public T pop(){
        if(isEmpty()){
            System.out.printf("\nStack Empty");
            exit(1);
        }
        Node<T> temp = stackTop;
        T itme  = temp.item;
        stackTop = stackTop.next;
        temp = null;
        return itme;
    }

    public boolean isEmpty(){
        return stackTop == null;
    }
}
