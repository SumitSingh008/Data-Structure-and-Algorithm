package Arrays;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896, 1234, 98 }; // sample input

        int count = countEvenDigitNumbers(nums); // method call

        System.out.println("Count of numbers with even number of digits: " + count);
    }

    // New method to handle counting
    static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    // Already existing digit checker
    static boolean hasEvenDigits(int num) {
        int digits = 0;

        if (num == 0)
            return false;

        while (num != 0) {
            num /= 10;
            digits++;
        }

        return digits % 2 == 0;
    }
}
