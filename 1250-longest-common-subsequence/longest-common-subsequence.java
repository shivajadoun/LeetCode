class Solution {
    static int n,m;
    public int solve(String s1,String s2,int i,int j,int memo[][]){
        if(i>=s1.length() ||j>=s2.length())return 0;
        if(memo[i][j]!=-1)return memo[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            memo[i][j]=1+solve(s1,s2,i+1,j+1,memo);
            return memo[i][j];
        }else{
            memo[i][j]=Math.max(solve(s1,s2,i+1,j,memo),solve(s1,s2,i,j+1,memo));
            return memo[i][j];
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][]=new int[1001][1001];
        int n=text1.length();
        int m=text2.length();
        for(int i=0;i<1001;i++){
            for(int j=0;j<1001;j++){
                memo[i][j]=-1;
            }
        }
      return  solve(text1,text2,0,0,memo);

    }
}