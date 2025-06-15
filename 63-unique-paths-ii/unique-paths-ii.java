class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1)arr[i][j]=-1;
            }
        }

        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            if(arr[i][0]==-1)break;
            dp[i][0]=1;
        }
        
        for(int i=0;i<m;i++){
            if(arr[0][i]==-1)break;
            dp[0][i]=1;
        }

        System.out.println(Arrays.deepToString(dp));
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=-1){
                    int sum=0;
                    if(arr[i-1][j]!=-1)  sum+=dp[i-1][j];
                    if(arr[i][j-1]!=-1)  sum+=dp[i][j-1];
                    dp[i][j]=sum;
                }
            }
        }
        return dp[n-1][m-1];
   }
}