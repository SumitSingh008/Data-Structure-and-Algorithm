package Recursion.patterns;

import java.util.Arrays;

import Recursion.recursion;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        recursionBubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursionBubbleSort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            recursionBubbleSort(arr, r, c + 1);
        } else {
            recursionBubbleSort(arr, r - 1, 0);
        }
    }
}
