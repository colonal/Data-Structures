public class Queue<T> {
    private Node<T> rear, front;
    private int length = 0;

    boolean isEmpty() {
        return length==0;
    }

    void enqueue(T itme) {
        Node<T> newNode = new Node<T>(itme);
        if (isEmpty()) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        ++length;
    }

    T dequeue() {
        if(isEmpty()) throw new NullPointerException("Queue is Empty");        
        Node<T> temp = front.next;
        front = temp;
        if (front == null) {
            rear = null;
        }
        length --;
        return temp.itme;
    }

    T getFront() {
        return front.itme;
    }

    T getRear() {
        return rear.itme;
    }

    void clear() {
        front = null;
        rear = null;
    }

    void desplay() {
        Node<T> temp = front;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.itme);
            temp = temp.next;
            System.out.print(temp != null ? ", " : "");
        }
        System.out.println("]");
    }

    int getSize(){
        return length;
    }

}