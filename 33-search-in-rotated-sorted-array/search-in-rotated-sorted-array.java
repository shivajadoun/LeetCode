class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] <= target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}

/**
TC: O(log N)
SC: O(1)
*/