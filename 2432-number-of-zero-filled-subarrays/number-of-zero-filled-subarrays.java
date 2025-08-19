class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)cnt++;
        }
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[l]!=0 || nums[r]!=0){
                r++;
                l=r;
            }else{
                cnt+=r-l;
                r++;

            }
        
        }
        return cnt;
        
    }
}