package Arrays;

public class Problem152 {
    public static void main(String[] args) {
        int[] nums = {3,-1, 4};
        System.out.print(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If negative, swap currMax and currMin
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // currMax = max(num, currMax * num)
            if (currMax * num > num) {
                currMax = currMax * num;
            } else {
                currMax = num;
            }

            // currMin = min(num, currMin * num)
            if (currMin * num < num) {
                currMin = currMin * num;
            } else {
                currMin = num;
            }

            // maxProd = max(maxProd, currMax)
            if (currMax > maxProd) {
                maxProd = currMax;
            }
        }

        return maxProd;
    }
}
