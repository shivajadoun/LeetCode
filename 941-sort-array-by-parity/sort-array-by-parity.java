class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int  arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[count++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[count++]=nums[i];
            }
        }
        return arr;
    }
}