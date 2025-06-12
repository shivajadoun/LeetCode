class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int hight=triangle.size();
        int dp[][]=new int[hight+1][hight+1];
        for(int i=hight-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);

            System.out.print(dp[i][j]+" ");
            }
        }  
        return dp[0][0];       
    }
}