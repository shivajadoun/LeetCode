class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
    
    int maxc=0;
    int cnt=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==max){
            cnt++;
            maxc=Math.max(cnt,maxc);
        }else{
            cnt=0;
        }
    }
        return maxc;
    }
}