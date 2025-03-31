class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr1[]=new int[nums.length/2];
        int arr2[]=new int[nums.length/2];
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)arr1[cnt1++]=nums[i];
            else arr2[cnt2++]=nums[i];
        }
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=arr1[j];
                j++;
            }else{
                nums[i]=arr2[k];
                k++;
            }
        }
        return nums;
    }
}