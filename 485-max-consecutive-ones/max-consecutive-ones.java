class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
       int dp[]=new int[n];
        
         if(nums[0]==1)dp[0]=1;
         int k=1;
         for(int i=1;i<n;i++){
            if(nums[i]==1){
                dp[i]=1+dp[i-1];
            }
           
            System.out.print(dp[i]+" ");

         } 
         int max=0;
         for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
         }
         return max;
    }
}