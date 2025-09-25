package Stack_and_Queue;

public class CustomQueue {
    private int[] data; // internal storage for tha queue element
    private static final int DEFAULT_SIZE = 10; // default queue size

    int end = -1; // // pointer to track "end" of the queue or ye end last element ke next index
                  // ko represent krta hai

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        // throw new UnsupportedOperationException("Unimplemented method 'isFull'");
        return end == data.length;// isse jyada or element add nhi kr skte jo ki defined hain jaise ki stack m h
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;// item add kro or pointer increment krdo
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        // shift the elements to left
        for (int i = 1; i < end; i++) {// index number 1 will start shfting
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }
}
