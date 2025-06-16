class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        while(l<r){
            int pair=0;
            int mid=l+(r-l)/2;
            for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]<=mid){
                    pair++;
                    i++;
                }
            }
            if(pair>=p)r=mid;
            else l=mid+1;
        }
        return r;
    }
}