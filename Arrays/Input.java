package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5]; // Declaration and initialization of array
        /*
         * arr[0] = 23; // Assigning values to the array
         * arr[1] = 45;
         * arr[2] = 233;
         * arr[3] = 543;
         * arr[4] = 3;
         */

        // Input using for loop
        /*
         * for (int i = 0; i < arr.length; i++) {
         * arr[i] = in.nextInt();
         * }
         */

        /*
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " ");
         * }
         */

        /*
         * for (int num : arr) { // for every element in arr, print the element
         * System.out.print(num + " ");// num here represents each element of the array
         * }
         */

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str)); // Print the array using Arrays.toString method
    }
}
