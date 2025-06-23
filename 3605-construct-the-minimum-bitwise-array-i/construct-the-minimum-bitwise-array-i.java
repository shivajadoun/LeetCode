class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==2)arr[i]=-1;
            else{
                for(int j=0;j<1000;j++){
                    if((j|j+1)==nums.get(i)){
                        arr[i]=j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}