class Solution {
    public String[] divideString(String s, int k, char fill) {
      int len=s.length();
      int rem=len%k;
      rem=rem !=0 ? k-rem:rem;
      StringBuilder sb=new StringBuilder(s);
      while(rem>0){
        sb.append(fill+"");
        rem--;
      }
    //   System.out.println(s);
      int d=0;
      int n=sb.length();
      String arr[]=new String[n/k];
      for(int i=0;i<n;i+=k){
        StringBuilder st=new StringBuilder();
        for(int j=i;j<i+k;j++){
        st.append(sb.charAt(j));
        }
        arr[d++]=st.toString();
      }
      return arr;
    }
}