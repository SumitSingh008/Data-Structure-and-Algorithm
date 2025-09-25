package Binary;

public class Mountain {
    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part
                // this might be the answer , but keep checking for the left
                end = mid;
            } else {
                // you are in the increasing part
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 8, 9, 7, 6, 1 };

        System.out.println(findPeakIndex(arr));
    }
}
