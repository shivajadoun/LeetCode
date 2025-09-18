class Solution {
    public int maxArea(int[] height) {
         int max=0;
         int l=0;
         int r=height.length-1;
         while(l<r){
            int dis=r-l;
          int aria= Math.min(height[l],height[r])*dis;
          max=Math.max(aria,max);
          if(height[l]>height[r])r--;
          else l++;
         }
         return max;
    }
}   