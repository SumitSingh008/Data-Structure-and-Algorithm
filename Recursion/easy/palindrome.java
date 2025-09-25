package Recursion.easy;

public class palindrome {
    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }

    static boolean isPalindrome(int number) {
        return number == reverse(number, 0);
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        rev = rev * 10 + (n % 10);
        return reverse(n / 10, rev);
    }
}
