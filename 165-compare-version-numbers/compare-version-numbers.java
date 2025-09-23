class Solution {
    public int compareVersion(String v1, String v2) {
       
      int i=0,j=0;
      int n=v1.length();
      int m=v2.length();
      while(i<n || j<m){
        int sum1=0;
        int sum2=0;
        while(i<n && v1.charAt(i)!='.'){
            sum1=sum1*10+(v1.charAt(i)-'0');
            i++;
        }
         while(j<m && v2.charAt(j)!='.'){
            sum2=sum2*10+(v2.charAt(j)-'0');
            j++;
        }
        if(sum1<sum2)return -1;
        if(sum1>sum2)return 1;
        i++;
        j++;
      }
      return 0;
    }
    
}