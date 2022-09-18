public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    int length = 0;

    boolean isEmpty() {
        return length == 0;
    }

    void append(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
            
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        ++length;
    }

    void insert(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
           
        } else {
            newNode.next = head;
            head = newNode;
        }
        ++length;
    }

    void insert(int index, T item) {
        
        if (index < 0 || index > length) {
            throw new NullPointerException("length Out Of range");
        }
        if (index == length) {
            append(item);
            return;
        }
        if (index == 0) {
            insert(item);
            return;
        }

        Node<T> curr = head;
        Node<T> newNode = new Node<>(item);
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        ++length;
    }

    T remove() {
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        Node<T> temp = head;
        head = temp.next;
        if(head == null){
            tail = null;
        }
        --length;
        return temp.item;
    }

    int remove(T elemnt){
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        if(head.item == elemnt){
            remove();
            return 0;
        }

        int i = 0;
        Node<T> temp = head.next;
        while (temp != null){
            
            if(temp.item == elemnt){
                removeOflength(++i);
                return i;
            }

            temp = temp.next;
            ++i ;
        }
        throw new NullPointerException(elemnt+" Not Found");
    }

    T removeOflength(int index){
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        if(length == 0) return remove();
        if(length == 1){
            T item = head.item;
            head = null;
            tail = null;
            return item;
        }
        if(index ==length-1) return pop();
        Node<T> curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        --length;
        return curr.next.item;
    }
    
    T pop(){
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        if(length == 0) return remove();
        if(length == 1){
            T item = head.item;
            head = null;
            tail = null;
            return item;
        }
        
        Node<T> curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        T item = curr.next.item;
        curr.next = null;
        tail = curr;
        --length;
        return item;

    }

    void display() {
        Node<T> temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.item);
            temp = temp.next;
            System.out.print(temp != null ? "," : "");
        }
        System.out.println("]");
    }

    void reverse(){
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        Node<T> prev, next, curr;
        prev = null;
        curr = head;
        next = curr.next;

        while(next!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    int search(T elemnt){
        if (isEmpty())
            throw new NullPointerException("List is Empty");
        
            Node<T> temp = head;
            int index  =0;
            while(temp !=null){
                if(temp.item == elemnt){
                    return index;
                }
                temp = temp.next;
                ++index;
            }
            return -1;
    }
}
