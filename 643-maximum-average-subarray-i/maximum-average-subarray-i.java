class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int  ans=0;
     for(int i=0;i<k;i++){
        ans+=nums[i];
       
     }
      double max=ans;
     int left=0;
     for(int i=k;i<nums.length;i++){
        ans=ans+nums[i]-nums[left];
        max=Math.max(ans,max);
        left++;
        
     }
     double ans2=max/k;
     return ans2;
    }
}