class Solution {
    public boolean doesAliceWin(String s) {
      String ans="";
      for(char c:s.toCharArray()){
        if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')ans+=c;
      }
      int n=ans.length();
      if(n==0)return false;
    //   if(n%2==0 ||n==1)return true;
    //   return false;
    return true;
    }
}