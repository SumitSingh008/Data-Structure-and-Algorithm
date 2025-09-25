package Binary;

public class rotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(Search(nums, target));
    }

    static int Search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            // Left part is sorted or not
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right part is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
