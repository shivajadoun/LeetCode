class Solution {
    int res;
    int solve(int [][] grid,int i,int j,boolean[][]vis,int curr,int [][][]dp){
        if(i<0||j<0||i>=grid[0].length || j>=grid[0].length ||vis[i][j]==true) return Integer.MAX_VALUE;
        curr=Math.max(curr,grid[i][j]);
        if(i==grid.length-1 && j==grid[0].length-1){
            return curr;
        }
        if(dp[i][j][curr]!=-1){
            return dp[i][j][curr];
        }
        vis[i][j]=true;
        int abhi=Integer.MAX_VALUE;
       abhi=Math.min(abhi, solve(grid,i+1,j,vis,curr,dp));
      
      abhi=Math.min(abhi,  solve(grid,i-1,j,vis,curr,dp));
        
       abhi=Math.min(abhi, solve(grid,i,j+1,vis,curr,dp));
       
      abhi=Math.min(abhi,  solve(grid,i,j-1,vis,curr,dp));
        vis[i][j]=false;
        return dp[i][j][curr]=abhi;
    }
    public int swimInWater(int[][] grid) {
        res=Integer.MAX_VALUE;
        int n=grid.length;
        int m=grid.length;
        int [][][] dp= new int[n][m][(n+1)*(m+1)];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                Arrays.fill(dp[i][j],-1);
            }
        }
        boolean vis[][]=new boolean [grid.length][grid[0].length];
         return solve(grid,0,0,vis,grid[0][0],dp);
        // System.out.println()
        // return res;
    }
}