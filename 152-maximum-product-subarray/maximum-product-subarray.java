class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int ans=1;
            for(int j=i;j<nums.length;j++){
                ans*=nums[j];
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}