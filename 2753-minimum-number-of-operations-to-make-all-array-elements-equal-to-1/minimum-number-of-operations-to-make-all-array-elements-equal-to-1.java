class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)cnt++;
        }
        if(cnt !=0){
            return n-cnt;

        }
        int minLen=Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                int g=nums[i];
                for(int j=i;j<n;j++){
                  g=gcd(g,nums[j]);
                  if(g==1){
                     minLen = Math.min(minLen, j - i + 1);
                     break;
                  }
                }
            }
      if(minLen==Integer.MAX_VALUE)  return -1;
      return (minLen-1)+(n-1);
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}