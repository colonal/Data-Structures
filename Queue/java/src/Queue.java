public class Queue<T> {
    private int rear;
    private int front;
    private int count;

    private Object[] array;

    private int MAX_SIZE;

    Queue(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        array = new Object[MAX_SIZE];

        rear = MAX_SIZE - 1;
        front = 0;
        count = 0;
    }

    Queue() {
        this(5);
    }

    void enqueue(T value) {
        if (isFull())
            throw new NullPointerException("Queue is Full");

        rear = (rear + 1) % MAX_SIZE;
        array[rear] = value;
        count++;

    }

    void dequeue() {
        if (isEmpty())
            throw new NullPointerException("Queue is Empty");

        array[front] = null;
        front = (front + 1) % MAX_SIZE;
        count--;

    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == MAX_SIZE;
    }

    T getFront() {
        if (isEmpty())
            throw new NullPointerException("Queue is Empty");
        @SuppressWarnings("unchecked")
        T t = (T) array[front];
        return t;
    }

    T getRear() {
        @SuppressWarnings("unchecked")
        T t = (T) array[rear];
        return t;
    }

    int getSize() {
        return count;
    }

    void clear() {
        count = 0;
        array = new Object[MAX_SIZE];
    }

    void display() {

        if (isEmpty())
            throw new NullPointerException("Queue is Empty");
        System.out.print("[");

        for (int i = front; i != rear; i = (i + 1) % MAX_SIZE) {

            System.out.print(array[i] + " ");
            System.out.print(i == rear ? "" : ",");

        }
        System.out.println(array[rear] + "]");
    }

    int search(T value) {
        if (isEmpty())
            throw new NullPointerException("Queue is Empty");
        int pos = -1;
        for (int i = front; i != rear; i = (i + 1) % MAX_SIZE) {
            if (array[i] == value) {
                pos = i;
                break;
            }
        }
        if (pos == -1 && array[rear] == value) {
            pos = rear;
        }

        return pos;
    }
}
