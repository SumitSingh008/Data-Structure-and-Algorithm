package Stack_and_Queue;

public class CircularQueue {
    protected int[] data; // internal storage for tha queue element
    private static final int DEFAULT_SIZE = 10; // default queue size

    protected int end = 0; // // pointer to track "end" of the queue or ye end last element ke next index
    protected int front = 0;// ko represent krta hai
    private int size = 0;// current size of the queue

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        // throw new UnsupportedOperationException("Unimplemented method 'isFull'");
        return size == data.length;// isse jyada or element add nhi kr skte jo ki defined hain jaise ki stack m h
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;// item add kro or pointer increment krdo
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
