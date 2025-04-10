class Solution {
    public int findGCD(int[] nums) {
         Arrays.sort(nums) ;
         int s=nums[0];
         int l=nums[nums.length-1];
         int ans=1;
         for(int i=s;i>=1;i--){
           if(s%i==0&&l%i==0)ans=Math.max(ans,i);
         }
         return ans;
    }
}