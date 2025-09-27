package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        /*
         * int n;
         * System.out.println("enter the number of elements");
         * n = sc.nextInt();
         * System.out.println("enter the elements");
         * for (int i = 1; i <= n; i++) {
         * int x = sc.nextInt();
         * s1.push(x);
         * }
         * System.out.println(s1);
         */

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("original stack: " + s1);
        // reverse order
        Stack<Integer> s2 = new Stack<>();
        while (!s1.isEmpty()) { // until s1 is not empty
            s2.push(s1.pop()); // pop from s1 and push to s2
        }
        System.out.println("reversed stack: " + s2);
        Stack<Integer> s3 = new Stack<>();
        while (!s2.isEmpty()) { // until s2 is not empty
            s3.push(s2.pop()); // pop from s2 and push to s3
        }
        System.out.println("reversed stack: " + s3);
    }
}
