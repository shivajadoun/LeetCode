class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
    int m=arr.length;
    int n=arr[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==1)arr[i][j]=-1;
        }
    }
    int dp[][]=new int [m][n];
       for(int i=0;i<m;i++){
        if(arr[i][0]==-1)break;
        else dp[i][0]=1;
       }
        for(int i=0;i<n;i++){
        if(arr[0][i]==-1)break;
        else dp[0][i]=1;
       }
       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(arr[i][j]!=-1){
                int sum=0;
                if(arr[i][j-1]!=-1)   sum+=dp[i][j-1];
                 if(arr[i-1][j]!=-1)   sum+=dp[i-1][j];
                 dp[i][j]=sum;
            }
        }
       }
       return dp[m-1][n-1];
       
   }
}