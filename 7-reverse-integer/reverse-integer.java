class Solution {
    public int reverse(int x) {
       
        int  ans=0;
        if(x==0)return x;
        if(x>0){
        
          while(x!=0){
            int rem=x%10;
            if(rem!=0)break;
            else  x/=10;
            
          }
          while(x!=0){
            int rem=x%10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;

            ans=ans*10+rem;
            x/=10;
          }
        
        }
         if(x<0){
        
          while(x!=0){
            int rem=x%10;
            if(rem!=0)break;
            else  x/=10;
            
          }
          while(x!=0){
            int rem=x%10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;

            ans=ans*10+rem;
            x/=10;
          }
                }
              

        return ans;
    }
}