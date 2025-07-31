class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
    
    int maxc=1;
    int cnt=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==max &&nums[i-1]==max){
            cnt++;
            maxc=Math.max(cnt,maxc);
        }else{
            cnt=1;
        }
    }
        return maxc;
    }
}