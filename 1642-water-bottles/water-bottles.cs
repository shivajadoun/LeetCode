public class Solution {
    public int NumWaterBottles(int numBottles, int numExchange) {
        int cnt=numBottles;
        while(numBottles>=numExchange){
             int rem=numBottles%numExchange;
             cnt+=numBottles/numExchange;
           numBottles=numBottles/numExchange+rem;

        }
        return cnt;
        
    }
}