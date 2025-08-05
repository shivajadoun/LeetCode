class Solution {
    public int maxSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
      int ans=0;
     int  max=0;
      for(int i=0;i<m-1;i++){
        for(int j=1;j<n-1;j++){
            if(j+1<n && i+2<m){
                ans=grid[i][j-1]+grid[i][j+1]+grid[i+1][j]+grid[i+2][j-1]+grid[i+2][j]+grid[i+2][j+1]+grid[i][j];
            }
            max=Math.max(ans,max);

        }
      }  
      return max;
    }
}