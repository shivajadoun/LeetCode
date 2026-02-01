class Solution {
    public int minimumCost(int[] nums) {
        int ans=nums[0];
        int j=0;
        while(j<2){
            int min=Integer.MAX_VALUE;
            int idx=0;
        for(int i=1;i<nums.length;i++){
            
            if(min>nums[i]){
                min=nums[i];
                idx=i;
            }
        }
            ans+=min;
            System.out.print(nums[idx]+" ");
            nums[idx]=Integer.MAX_VALUE;
            j++;
        }
        return ans;
    }
}