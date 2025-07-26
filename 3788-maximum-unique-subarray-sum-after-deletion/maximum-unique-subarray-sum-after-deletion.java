class Solution {
    public int maxSum(int[] nums) {
         int max=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
         }
           if(max<0)return max;
           int sum=0;
           Set<Integer>set=new HashSet<>();
           for(int i=0;i<nums.length;i++){
              if(nums[i]>=0){
                set.add(nums[i]);
              }
           }
           for(int i:set){
            sum+=i;
           }
           return sum;


    }
}