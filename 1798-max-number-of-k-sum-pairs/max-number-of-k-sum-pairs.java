class Solution {
    public int maxOperations(int[] nums, int k) {
          Arrays.sort(nums);
          int i=0;
          int j=nums.length-1;
          int cnt=0;
          while(i<j){
            int temp=nums[i]+nums[j];
            if(temp==k){
                cnt++;
                i++;j--;
            }
             else if(temp>k)j--;
            else i++;
          }
         return cnt;
    }
}