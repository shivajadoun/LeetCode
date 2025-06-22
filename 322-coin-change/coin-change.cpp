class Solution {
public:
int solve(vector<int>&coins,int t,int i,vector<vector<int>>&dp){
    if(t==0) return 0;
    if(i>=coins.size()){
       return INT_MAX-1;
    }
    if(dp[i][t]!=-1) return dp[i][t];
    int p=INT_MAX-1;
    if(t-coins[i]>=0)p=1+solve(coins,t-coins[i],i,dp);
    int n=solve(coins,t,i+1,dp);
    return dp[i][t]=min(p,n);
}
    int coinChange(vector<int>& coins, int amount) {
         vector<vector<int>>dp(coins.size(),vector<int>(amount+1,-1));
         int ans=solve(coins,amount,0,dp);
         if(ans==INT_MAX-1) return -1;
         return ans;
    }
};