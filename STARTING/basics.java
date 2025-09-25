package STARTING;

import java.util.Scanner;

public class basics {
    // Q1. INput an integer and print it
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a number: ");
     * int number = sc.nextInt();
     * System.out.println("You entered: " + number);
     * 
     * }
     */

    // Q2. input float and print with 2 decimal places
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a float number: ");
     * float number = sc.nextFloat();
     * System.out.printf("You entered: %.2f\n", number);
     * }
     */

    // Q3. input character and display ASCII
    /*
     * public static void main(String[] args){
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a character: ");
     * char ch = sc.next().charAt(0);
     * System.out.println("ASCII: " + (int)ch);
     * }
     */

    // Q4. input a word and print in uppercase
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a word: ");
     * String word = sc.next();
     * System.out.println(word.toUpperCase());
     * }
     */

    // Q5. input a line and print character count
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a line: ");
     * String line = sc.nextLine();
     * System.out.println("character count: " + line.length());
     * }
     */

    // Q6. sum, diff, product of 2 integers
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter the first integer: ");
     * int a = sc.nextInt();
     * System.out.print("Enter the second integer: ");
     * int b = sc.nextInt();
     * int sum = a + b;
     * int diff = a - b;
     * int product = a * b;
     * System.out.println("Sum: " + sum);
     * System.out.println("Difference: " + diff);
     * System.out.println("Product: " + product);
     * }
     */

    // Q7. Average of 2 float numbers
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter the first float number: ");
     * float a = sc.nextFloat();
     * System.out.print("Enter the second float number: ");
     * float b = sc.nextFloat();
     * float average = (a + b) / 2;
     * System.out.printf("Average: %.2f\n", average);
     * }
     */

    // Q8. Repeat a character n times
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter a character: ");
     * char ch = sc.next().charAt(0);
     * System.out.print("Enter the number of times to repeat: ");
     * // Using nextInt() to read an integer input
     * int n = sc.nextInt();
     * for (int i = 0; i < n; i++) {
     * System.out.print(ch);
     * }
     * }
     */

    // Q9. two strings, reverse order
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter first string: ");
     * String first = sc.next();
     * System.out.print("Enter second string: ");
     * String second = sc.next();
     * System.out.println(second + " " + first);
     * }
     */

    // Q10. print number from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 0; num < n; num++) {
            System.out.println(num);
        }
    }

}
