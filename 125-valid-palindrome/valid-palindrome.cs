public class Solution {
    public bool IsPalindrome(string s) {
         string st=s.ToLower();
         string ans=""; 
         foreach(char c in st){
            if((c>='a' && c<='z') || (c>='0' && c<='9'))ans+=c;
         }
         int i=0,j=ans.Length-1;
         while(i<j){
            if(ans[i]!=ans[j])return false;
            i++;j--;
         }
         
         Console.WriteLine(ans);
         return true;
    }
}