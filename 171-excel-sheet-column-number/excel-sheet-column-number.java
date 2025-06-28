class Solution {
    public int titleToNumber(String col) {
        int n=col.length();
        int sum=0;
      for(int i=0;i<n;i++){
        char ch=col.charAt(i);
           if(i==0)
           sum+=ch-'A'+1;
           else{
            sum=sum*26+ ch-'A'+1;
            
           }
      } 
      return sum;  
    }
}