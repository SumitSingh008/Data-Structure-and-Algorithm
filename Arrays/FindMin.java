package Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(min(arr));
    }


    static int min(int[] arr) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE; // Return max value if array is empty
        }

        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }

        return min; // Return the minimum value found in the array
    }


}
