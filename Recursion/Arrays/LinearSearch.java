package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4, 4, 5 };
        int target = 4;

        ArrayList<Integer> result = findAllIndexes(arr, target, 0, new ArrayList<>());
        System.out.println(result);
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        // Base case: end of array
        if (index == arr.length) {
            return list;
        }

        // check if current element matches
        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndexes(arr, target, index + 1, list);
    }
}
