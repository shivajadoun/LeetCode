class Solution {
    public boolean isPalindrome(String s) {
        String  sl=s.toLowerCase();
        String onlS="";
        for(int i=0;i<sl.length();i++){
            if(sl.charAt(i)>='a' && sl.charAt(i)<='z' || (sl.charAt(i) >= '0' && sl.charAt(i) <= '9')){
                onlS+=sl.charAt(i);
            }
        }
         System.out.println(onlS);
          String rev="";
          for(int i=onlS.length()-1;i>=0;i--){
            rev+=onlS.charAt(i);
          }
           System.out.print(rev);

          return onlS.equals(rev);
    }
}