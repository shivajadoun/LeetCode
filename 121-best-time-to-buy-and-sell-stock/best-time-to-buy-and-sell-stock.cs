public class Solution {
    public int MaxProfit(int[] prices) {
      int max=0;
      int n=prices[prices.Length-1];
      for(int i=prices.Length-2;i>=0;i--){
        int price=0;
           if(prices[i]>n)n=prices[i];
           
           else{
             price=n-prices[i];
           }
           max=Math.Max(price,max);
      }
      return max;
    }
}