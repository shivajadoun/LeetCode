public class Solution {
    public int SmallestNumber(int n, int t) {
        int i=n;
         while(i<=100){
            int j=n;
            int a=1;
            while(j!=0){
            int rem=j%10;
            a*=rem;
            j/=10;
            }
            // System.out.print(a);
            if(a%t==0)return n;
            else n+=1;
            
            i++;
            
         }
         return 0;
    }
}