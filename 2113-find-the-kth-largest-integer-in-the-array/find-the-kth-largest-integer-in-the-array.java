import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] arr = new BigInteger[nums.length];
        int n=nums.length;

        // Convert all string numbers to BigInteger
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new BigInteger(nums[i]);
        }

        // Sort the array in descending order
        Arrays.sort(arr);

        // Return the kth largest number as a string
        return arr[n-k].toString();
    }
}
