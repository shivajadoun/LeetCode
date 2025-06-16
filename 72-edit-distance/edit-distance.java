class Solution {
    public int solve(String w1,String w2, int i,int j,int[][]dp){
        if(w2.length()==j)return w1.length()-i;
        if(w1.length()==i)return w2.length()-j;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(w1.charAt(i)==w2.charAt(j)){
           ans=  solve(w1,w2,i+1,j+1,dp);
        }else{
            int f=1+solve(w1,w2,i+1,j+1,dp);
            int s=1+solve(w1,w2,i+1,j,dp); 
            int t=1+solve(w1,w2,i,j+1,dp);
            ans=Math.min(f,Math.min(s,t));
       }
       return dp[i][j]=ans;
    }
    public int minDistance(String w1, String w2) {
        int [][]dp=new int[501][501];
        for(int i=0;i<dp.length;++i){
            for(int j=0;j<dp.length;++j){
                dp[i][j]=-1;
            }
        }
      return  solve(w1,w2,0,0,dp);

    }
}