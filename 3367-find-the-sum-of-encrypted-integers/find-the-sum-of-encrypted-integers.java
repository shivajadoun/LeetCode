class Solution {
    private static int helper(int n){
        int max=0;
        int temp=n;
        while(temp!=0){
            int num=temp%10;
            max=Math.max(num,max);
            temp/=10;
        }
        int ans=0;
        while(n!=0){
           ans=ans*10+max; 
           n=n/10;
        }
        return ans;
    }
    public int sumOfEncryptedInt(int[] nums) {
          int ans2=0;
          for(int i=0;i<nums.length;i++){
            ans2+=helper(nums[i]);
          }
          return ans2;
    }
}