class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
            int cnt=0;
            for(int i=0;i<n-2;i++){
                for(int j=i;j<n-1;j++){
                    for(int k=j;k<n;k++){
                        int a2=Math.abs(arr[i]-arr[j]);
                        int b2=Math.abs(arr[j]-arr[k]);
                        int c2=Math.abs(arr[i]-arr[k]);
                          
                        if((a2<=a && b2<=b && c2<=c) && i!=j && j!=k)cnt++;
                    }
                }
            }
            return cnt;
    }
}