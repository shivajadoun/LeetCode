class Solution {
    public int maxArea(int[] nums) {
     int max=0;
     int n=nums.length;
     int l=0;int r=n-1;
        while(l<r){
            int dis=r-l;
            int area=Math.min(nums[l],nums[r])*dis;
            max=Math.max(max,area);
            if(nums[l]>nums[r])r--;
            else l++;
        }
        return max;
    }
}   