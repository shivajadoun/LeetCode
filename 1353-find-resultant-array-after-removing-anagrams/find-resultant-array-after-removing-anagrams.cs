public class Solution {
    public IList<string> RemoveAnagrams(string[] words) {
      
        List<string>ll=new List<string>();
        string k="";
        foreach(string s in words){
            char []ch=s.ToCharArray();
            Array.Sort(ch);
            string ans= new string(ch);
            if(ans !=k){
                ll.Add(s);
                k=ans;
            } 
        }
     
        return ll;
    }
}