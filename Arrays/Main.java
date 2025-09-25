package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Q. store a roll number
        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialization of array. actually here object is being created in the memory
                          // heap.

        // Print the array
        System.out.println("Roll Numbers: " + Arrays.toString(ros));
    }
}
