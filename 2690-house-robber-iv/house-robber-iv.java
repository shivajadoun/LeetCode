public class Solution {
    public int minCapability(int[] nums, int k) {  
        int left = 1, right = 1_000_000_000;  
        while (left < right) {  
            int mid = (left + right) / 2;  
            int count = 0;  
            int i = 0;  
            while (i < nums.length && count < k) {  
                if (nums[i] <= mid) {  
                    count++;  
                    i += 2;  
                } else {  
                    i++;  
                }  
            }  
            if (count < k) {  
                left = mid + 1;  
            } else {  
                right = mid;  
            }  
        }  

        return left;  
    }
}

    