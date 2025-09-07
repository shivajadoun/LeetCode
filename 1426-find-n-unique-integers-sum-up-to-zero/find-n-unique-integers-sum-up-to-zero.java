class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        if(n%2==0){
           int k=n/2;
           int j=0;
           for(int i=-k;i<=k;i++){
            if(i==0)continue;
            arr[j++]=i;
           }
        }else{
            int k=n/2;
          int  j=0;
                  for(int i=-k;i<=k;i++){
           
            arr[j++]=i;
           }
        }
        
        return arr;
    }
}