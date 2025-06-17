class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      return  solve(nums,0,0,target);
    }
        private int solve(int nums[],int i,int sum,int target){
            if(i==nums.length){
                if(sum==target)return 1;
                else return 0;
            }
            int plus=0;
            int sub=0;
            plus=solve(nums,i+1,sum+nums[i],target);
            sub=solve(nums,i+1,sum-nums[i],target);
            return plus+sub;
        }
}