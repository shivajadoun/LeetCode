public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int idx=0;
        for(int i=0;i<nums.Length;i++){
            if(nums[i]>=target){
                idx=i;
                break;
                }

        }
        if(target>nums[nums.Length-1])idx=nums.Length;
        return idx;
    }
}