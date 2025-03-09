class Solution {
    public int[] shortestToChar(String s, char c) {
        char arr[]=s.toCharArray();
        int arr2[]=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            int left=i,right=i,cntl=Integer.MAX_VALUE,cntr=Integer.MAX_VALUE;
            while(left>=0){
               if(arr[left]==c){
                 cntl=i-left;
                 break;
               }
               left--; 
            }
             while(right<arr.length){
               if(arr[right]==c){
                 cntr=right-i;
                 break;
               }
               right++;   
            }
            arr2[i]=Math.min(cntl,cntr);
        }
        return arr2;
    }
}