class Solution {
    public boolean checkOnesSegment(String s) {
           int cn=0;
           int j=s.length()-1;
          while(j>=0){
            if(s.charAt(j)=='0'){
            j--;
                continue;
            }
            else{
                j--;
             break;
            } 
          }
          while(j>=0){
            if(s.charAt(j)=='1'){
                j--;
                continue;
            }else return false;
          }
          return true;  
           
    }
}