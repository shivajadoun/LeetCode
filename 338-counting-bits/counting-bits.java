class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int cnt=0;
         int i=0;
        while(n>=i){
           String num= Integer.toBinaryString(i);
           long a=Long.parseLong(num);
           int ans=0;
           while(a!=0){
            ans+=a%10;
            a/=10;
           }
           arr[cnt++]=ans;
           i++;
        }
        return arr;
    }
}