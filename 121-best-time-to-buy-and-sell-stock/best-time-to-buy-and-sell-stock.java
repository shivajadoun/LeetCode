class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprofit=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int cost=prices[i]-minprofit;
            maxprofit=Math.max(maxprofit,cost);
            minprofit=Math.min(minprofit,prices[i]);
        }
        return maxprofit;
        
    }
}