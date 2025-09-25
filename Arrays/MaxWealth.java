package Arrays;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 5, 6 }
        };
        System.out.println(maximumWealth(accounts)); // Output: 15

    }

    static int maximumWealth(int[][] accounts) {
        // person = col
        // account = row
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new column or person , take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                // add the value of the current account to the sum
                sum += anInt;
            }

            // now we have the sum of all accounts for that person
            // we can check if this is the maximum wealth so far
            if (sum > ans) {
                ans = sum;
            }
        }
        // return the maximum wealth(ans) found
        return ans;
    }
}
