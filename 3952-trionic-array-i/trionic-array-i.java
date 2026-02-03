class Solution {
    public boolean isTrionic(int[] nums) {

        int p1 = -1;
        int n = nums.length - 1;

        int s = nums[0];
        for (int i = 1; i <= n; i++) {
            if (s < nums[i]) {
                s = nums[i];
            } else {
                p1 = i - 1;   
                if (p1 == 0 || p1 >= n - 1) return false;
                break;
            }
        }

        if (p1 == -1) return false;

    
        int p2 = -1;
        int e = nums[p1];

        for (int i = p1 + 1; i <= n; i++) {
            if (e > nums[i]) {
                e = nums[i];
            } else {
                p2 = i - 1;
                if (p2 <= p1 || p2 == n) return false;
                break;
            }
        }

        if (p2 == -1) return false;

      
        for (int i = p2 + 1; i <= n; i++) {
            if (nums[i - 1] >= nums[i]) {
                return false;
            }
        }

        return true;
    }
}
