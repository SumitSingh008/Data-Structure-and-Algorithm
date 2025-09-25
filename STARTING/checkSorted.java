package STARTING;

public class checkSorted {

    // Normal iterative approach
    public static boolean checkSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSorted(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            // array is sorted till now
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(checkSort(arr));
        System.out.println(isSorted(arr, 0));
    }
}
