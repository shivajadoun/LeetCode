class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        
       for(int i=0;i<nums.length;i++){
        int cur=nums[i];
        if(cur==1 || cur==0){
            arr[i]=true;
            continue;
        }
        int curr=(int)Math.sqrt(cur);
        int j=2;
        int cnt=0;

        while(j<=curr){
            if(cur%j==0){
                arr[i]=true;
                break;
            }
            j++;

        }
        
        // System.out.print(arr[i]+" ");
       }
       int st=0;
       int ed=0;
       for(int i=0;i<nums.length;i++){
        if(arr[i]==false){
            st=i;
            break;
        }
       }
       for(int i=nums.length-1;i>=0;i--){
        if(arr[i]==false){
            ed=i;
            break;
        }
       
       }
        return Math.abs(st-ed);
    }
}