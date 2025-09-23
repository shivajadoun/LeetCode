class Solution {
    public int maxFrequencyElements(int[] nums) {
    int arr[]=new int[1001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int max=0;
        for(int i=0;i<=100;i++){
            max=Math.max(arr[i],max);
        }
        int sum=0;
           for(int i=0;i<=100;i++){
            if(arr[i]==max)sum+=arr[i];
            
        }
        return sum;
    }
}