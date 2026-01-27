class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-k+1;i++){
               int diff=nums[i+k-1]-nums[i];
               System.out.print(diff+" ");
               ans=Math.min(diff,ans);
        }
        return ans;

    }
}