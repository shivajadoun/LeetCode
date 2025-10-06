public class Solution {
    public int Fib(int n) {
        if(n==0)return 0;
        if (n==1)return 1;
        int t=0;
        int j=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=t+j;
             t=j;
             j=sum;

        }
        return sum;
    }
}
        