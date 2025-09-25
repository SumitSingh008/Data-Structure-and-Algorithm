package STARTING;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
        /*
         * int max = a;
         * if (b > max) {
         * max = b;
         * }
         * if (c > max) {
         * max = c;
         * }
         * 
         * System.out.println(max);
         */

        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);

        in.close();
    }
}
