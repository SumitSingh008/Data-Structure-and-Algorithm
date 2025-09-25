package STARTING;

public class Loops {
  public static void main(String[] args) {

    /*
     * for(int i = 0; i <= 5; i++ ) {
     * System.out.println("Number: "+ i);
     * }
     */

    // 2. PRINT EVEN NUMBER FROM 1 TO 10
    /*
     * for(int a=2; a<=10; a+=2 ) {
     * System.out.println("Even Number: "+ a);
     * }
     */

    /*
     * int[] numbers = {10, 20, 30, 40, 50};
     * for(int i=0; i<numbers.length; i++) {
     * System.out.println("Number: "+ numbers[i]);
     * }
     */

    // WHILE LOOP SYNTAX
    /*
     * Syntax:
     * while(condition) {
     * //body
     * }
     */

    int num = 1;
    /*
     * while (num <= 5) {
     * System.out.println("Number: "+ num);
     * num++;
     * }
     */

    // do while loop syntax
    /*
     * do {
     * 
     * } while (condition);
     */

    do {
      System.out.println("Number: " + num);
      num += 1;
    } while (num <= 5);

  }
}