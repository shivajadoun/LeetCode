class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int ans=nums[j]-nums[i];
                    max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
}