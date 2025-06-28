class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer>ll=new ArrayList<>();
        int arr2[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr2[i]=nums[i];
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(k>0){
            ll.add(nums[i]);
            k--;
            }
        }
        int t=0;
        int arr[]=new int[ll.size()];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<ll.size();j++){
                if(arr2[i]==ll.get(j)){
                arr[t++]=arr2[i];
                ll.set(j,Integer.MAX_VALUE);
                        break;
                }
            }
            if(k==arr.length)break;
        }
    
      
        return arr;
    }
}