package Binary;

// Step 1: Define the MountainArray interface
interface MountainArray {
    int get(int index);

    int length();
}

// Step 2: Create a custom implementation for testing
class CustomMountainArray implements MountainArray {
    private int[] arr;

    public CustomMountainArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

public class findInMountain {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1)
            return left;

        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeak(MountainArray arr) {
        int start = 0, end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray arr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);

            if (val == target)
                return mid;

            if (asc) {
                if (target < val)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > val)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
