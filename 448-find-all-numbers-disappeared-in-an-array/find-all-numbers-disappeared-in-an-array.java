class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int arr[]=new int [nums.length];
       for(int i=0;i<nums.length;i++){
         arr[nums[i]-1]=-1;
       }
       ArrayList<Integer>ll=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=-1)ll.add(i+1);
       }
       return ll;
    }
}