class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        // Ensure binary search is always performed on the smaller array
        if (n2 < n1)
            return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = n1;

        // Binary search on the first (smaller) array
        while (low <= high) {
            // Partition indices for both arrays
            int cut1 = low + (high - low) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            // Edge cases: use MIN/MAX when partition is at array bounds
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            // Valid partition found
            if (left1 <= right2 && left2 <= right1) {
                // If total number of elements is even, return average of middle two
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    // If odd, return the max of left half
                    return Math.max(left1, left2);
                }
            }
            // If left1 is too big, move cut1 to the left
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            // If left2 is too big, move cut1 to the right
            else {
                low = cut1 + 1;
            }
        }

        // Should never reach here for valid input
        return 0.0;
    }
}

/**
Time complexity: O(log(min(n,m)))
Space complexity: O(1)
*/