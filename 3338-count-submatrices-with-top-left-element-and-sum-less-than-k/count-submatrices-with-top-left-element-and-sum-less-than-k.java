class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
          int arr[][]=new int[m][n];
          arr[0][0]=grid[0][0];
          for(int i=1;i<n;i++){
            arr[0][i]=grid[0][i]+arr[0][i-1];
          }
            for(int i=1;i<m;i++){
            arr[i][0]=grid[i][0]+arr[i-1][0];
          }
          for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=grid[i][j]+arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];

            }
          }
          int cnt=0;
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<=k)cnt++;
            }
          }
          return cnt;

    }
}