public class Solution {
 static String helper(String s,String t){
      int len=Math.Min(s.Length,t.Length);
      string ans="";
      for(int i=0;i<len;i++){
        if(s[i]==t[i])ans+=s[i];
        else break;
      }
      return ans;
  }
    public string LongestCommonPrefix(string[] strs) {
        string ans=strs[0];
        for(int i=1;i<strs.Length;i++){
            ans=helper(ans,strs[i]);
        }
        return ans;
    }
}