package STARTING;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String n = sc.nextLine();

        System.out.println("Enter the digit to count: ");
        char digit = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == digit) {
                count++;
            }
        }

        System.out.println("The digit '" + digit + "' appears " + count + " times in the number " + n + ".");
    }
}
