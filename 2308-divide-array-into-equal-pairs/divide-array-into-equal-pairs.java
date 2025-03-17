class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n%2!=0)return false;
        int i=1;
        Arrays.sort(nums);
        while(i<n){
            if(nums[i]!=nums[i-1])return false;
            i+=2;
        }
        return true;
    }
}