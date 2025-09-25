package Arrays;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element; // Return the index of the target element
            }
        }

        return -1; // Target not found in the array
    }

}
