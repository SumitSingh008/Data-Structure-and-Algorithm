package Arrays;

import java.util.Scanner;
import java.util.Arrays;
// SearchArr.java

public class SearchArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5]; // Declaration and initialization of array

        System.out.print("Enter 5 elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // Input elements into the array
        }

        System.out.print("Enter the digit to search for: ");
        int digit = in.nextInt(); // Input the digit to search for
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                System.out.println("Element " + digit + " found at index: " + i);
                // Decrement i to repeat the input for the same index
            }
        }

    }

}
