class Solution {
    public int[] sortEvenOdd(int[] nums) {
       ArrayList<Integer>ll1=new ArrayList<>();
        ArrayList<Integer>ll2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0)ll1.add(nums[i]);
            else ll2.add(nums[i]);
        }
        Collections.sort(ll1); 
        Collections.sort(ll2, Collections.reverseOrder());
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)nums[i]=ll1.get(e++);
            else nums[i]=ll2.get(o++);
        } 
       return nums;
    }
}