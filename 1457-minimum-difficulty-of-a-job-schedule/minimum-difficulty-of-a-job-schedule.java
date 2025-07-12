class Solution {
    public static int  solve(int arr[],int n,int idx,int d,int dp[][]){
        if(d==1){
            int max=arr[idx];
            for(int i=idx;i<n;i++){
                max=Math.max(max,arr[i]);
                }
                return max;
            }
            if(dp[idx][d]!=-1)return dp[idx][d];
            int max=arr[idx];
            int fres=Integer.MAX_VALUE;
            for(int i=idx;i<=n-d;i++){
                max=Math.max(max,arr[i]);
                int resf=max+solve(arr,n,i+1,d-1,dp);
                fres=Math.min(fres,resf);
            }
            return dp[idx][d]=fres;
        
    }
    public int minDifficulty(int[] job, int d) {
        int dp[][]=new int[2000][2000];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
       if(job.length<d)return -1;
       return solve(job,job.length,0,d,dp);
    }
}