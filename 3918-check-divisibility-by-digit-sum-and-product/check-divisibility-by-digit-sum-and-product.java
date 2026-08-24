class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int tem=n;
        while(tem!=0){
           int rem=tem%10;
            sum+=rem;
            pro*=rem;
            tem/=10;
        }
        System.out.print(sum +" "+pro);
        int div=pro+sum;
        if(n%div==0)return true;
        return false;
    }
}