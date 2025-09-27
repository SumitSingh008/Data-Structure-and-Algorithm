package Stack_and_Queue;

import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("original stack: " + s);
        insertAtBottom(s, 0);
        System.out.println("stack after insertion at bottom: " + s);
        insertAtAPosition(s, 9, 3);
        System.out.println("stack after insertion at position 3: " + s);
    }

    private static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertAtBottom(s, x);
        s.push(temp);
    }

    private static void insertAtAPosition(Stack<Integer> s, int x, int pos) {
        if (pos == 0) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertAtAPosition(s, x, pos - 1);
        s.push(temp);
    }
}
