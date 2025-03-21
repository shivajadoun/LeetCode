class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]={-1,-1};
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            if(numbers[left]+numbers[right]>target){
                 right--;
        }  if(numbers[left]+numbers[right]<target){
            left++;
        }
        }
        return arr;
    }
}