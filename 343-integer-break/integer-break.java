class Solution {
    public int integerBreak(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);

        return solve(n, arr);
    }
    private int solve(int n, int arr[]){
        if(n==1)return 1;
        if(arr[n]!=-1)return arr[n];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int prod=Math.max(i*(n-i),i*solve(n-i,arr));
            max=Math.max(max,prod);
        }
         arr[n]=max;
       return arr[n];
    }
}