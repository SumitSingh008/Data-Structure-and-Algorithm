package Sorting;

import java.util.*;

public class MissingNumbers448 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result); // Output: [5, 6]
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // Check bounds and avoid infinite swap if duplicate exists
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Now find missing numbers
        List<Integer> missing = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                missing.add(index + 1); // this number is missing
            }
        }

        return missing;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
