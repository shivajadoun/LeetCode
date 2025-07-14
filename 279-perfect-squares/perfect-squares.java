class Solution {
    public static int solve(int n,int arr[]){
        if(n==0)return 0;
        if(arr[n]!=-1)return arr[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
           int res=1+solve(n-i*i,arr);
           min=Math.min(res,min);
        }
        return arr[n]= min;
    }
    public int numSquares(int n) {
        int arr[]=new int [n+1];
        Arrays.fill(arr,-1);
        return solve(n,arr);
    }
}