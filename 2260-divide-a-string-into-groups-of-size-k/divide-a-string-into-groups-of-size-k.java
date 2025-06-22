class Solution {
    public String[] divideString(String s, int k, char fill) {
      int len=s.length();
      int rem=len%k;
      rem=rem !=0 ? k-rem:rem;
      while(rem>0){
        s+=fill;
        rem--;
      }
      System.out.println(s);
      int d=0;
      int n=s.length();
      String arr[]=new String[n/k];
      for(int i=0;i<n;i+=k){
        String st="";
        for(int j=i;j<i+k;j++){
        st+=s.charAt(j);
        }
        arr[d++]=st;
      }
      return arr;
    }
}