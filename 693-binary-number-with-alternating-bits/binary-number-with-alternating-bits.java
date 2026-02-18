class Solution {
    public boolean hasAlternatingBits(int n) {
        String ss=Integer.toBinaryString(n);
        if (n==0 || n==1)return true;
        for(int i=1;i<ss.length();i++){
            if(ss.charAt(i)==ss.charAt(i-1))return false;
        }
        return true;
    }
}