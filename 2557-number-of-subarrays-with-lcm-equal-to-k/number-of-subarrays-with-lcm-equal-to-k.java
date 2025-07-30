class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int lcm=nums[i];
            for(int j=i;j<nums.length;j++){
                 lcm=(lcm*nums[j])/gcd(lcm,nums[j]);
                
                if(lcm==k){
                    System.out.print(nums[j]+" ");
                    cnt++;
                }

                if(lcm>k)break;

            }
        }
        return cnt;
    }
    public static int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

}