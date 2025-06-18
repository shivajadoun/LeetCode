class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d)return -1;
        int dp[][]=new int[n][d+1];
       for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
       }
        return solve( jobDifficulty,d,0, dp);
    }
    private int solve( int arr[],int d,int i,int dp[][]){
        if(d==1){
            int maxd=arr[i];
            for(int k=i;k<arr.length;k++){
                maxd=Math.max(arr[k],maxd);
            }
            return maxd;
        }
        if(dp[i][d]!=-1)return dp[i][d];
        int max=0;
        int finalr=Integer.MAX_VALUE;
        for(int j=i;j<=arr.length-d;j++){
            max=Math.max(max,arr[j]);
            int result=max+solve(arr,d-1,j+1,dp);
              finalr=Math.min(result,finalr);
        }
        return dp[i][d]=finalr;
    }
}