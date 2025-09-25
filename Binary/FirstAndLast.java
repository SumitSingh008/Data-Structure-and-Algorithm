package Binary;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 8;
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        // check for the first occurance if the taget first
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    // this fuction just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                start = 0;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}