class Solution {
    public int addDigits(int num) {
        if(num>=0&&num<=9)return num;
        int rem=0;
        while(num!=0){
            rem+=num%10;
            num/=10;
        }
        return addDigits(rem);
    }
}