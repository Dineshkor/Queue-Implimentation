package datastrutures;

public class Queue {
    private static final int DEF_VAVUE = 10;
    private int size, front, rear, capacity;
    private int[] queue;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = rear = size = 0;
        this.capacity = capacity;
    }

    public Queue() {
        this(DEF_VAVUE);
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void enque(int data) {
        if (rear == capacity) {
            System.out.println("Stack full");
            return;
        }

        queue[rear] = data;
        rear++;
        size++;

    }

    public int deque() {
        if (front == rear) {
            System.out.println("queue is empty");
            return -1;
        }
        int retval = queue[front];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        if (rear < capacity) {
            queue[rear] = 0;
        }

        rear--;
        size--;

        return retval;
    }

    @Override
    public String toString() {
        String retval = "";
        for (int i = 0; i < queue.length; i++) {
            retval += queue[i] + " ";
        }
        return retval;
    }
}
