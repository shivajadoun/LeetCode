class Solution {
    public int differenceOfSums(int n, int m) {
        int i=1;
        int sum1=0;
        int sum2=0;
           while(i<=n){
             if(i%m!=0)
                sum1+=i;
          
             else sum2+=i;
            
             i++;
           }
           return sum1-sum2;
    }
}