class Solution {
    public boolean isPowerOfThree(int n) {
        while(n!=0){
            if(n==1)return true;
            int rem=n%3;
            if(rem==1 ||rem==2)return false;
            n/=3;
        }
        return false;
    }
}