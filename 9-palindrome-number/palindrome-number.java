class Solution {
    public boolean isPalindrome(int x) {
           if(x<0)return false;
           int tem=x;
           int ans=0;
           while(tem!=0){
            int rem=tem%10;
            ans=ans*10+rem;
            tem/=10;
           }
           return ans==x;
    }
}