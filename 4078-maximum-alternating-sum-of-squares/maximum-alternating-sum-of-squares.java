class Solution {
    public long maxAlternatingSum(int[] nums) {
        if(nums.length==1)return nums[0]*nums[0];
       for(int i=0;i<nums.length;i++){
        if(nums[i]<0)nums[i]*=-1;
       }
       Arrays.sort(nums);
       long pos=0;
       long neg=0;
       int k=0;
       while(k<nums.length/2){
        neg+=nums[k]*nums[k];
        k++;
       }
       int l=nums.length-1;
        while(l>=k ){
        pos+=nums[l]*nums[l];
        l--;
       }
       return pos-neg;

    }
}