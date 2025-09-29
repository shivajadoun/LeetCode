public class Solution {
    public int StrStr(string haystack, string needle) {
        for(int i=0;i<=haystack.Length-needle.Length;i++){
            string s="";
            for(int j=i;j<i+needle.Length;j++){
                 s+=haystack[j];
            }
            Console.WriteLine(s);
            if(s.Equals(needle))return i;
        }
        return -1;
    }
}