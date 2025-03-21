class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        int left=0;
    double max=ans;
        for(int i=k;i<nums.length;i++){
             ans+=nums[i];
             ans-=nums[left++];
             max=Math.max(ans,max);
             
        }
        double ans2=max/k;
        return ans2;
    }
}