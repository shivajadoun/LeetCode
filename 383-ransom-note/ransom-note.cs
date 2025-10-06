public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
    Dictionary<char, int> ran = new Dictionary<char, int>();
    Dictionary<char, int>mag=new Dictionary<char,int>();
        foreach(char c in magazine){
            if(mag.ContainsKey(c))mag[c]++;
           else mag[c]=1;
         }
         foreach(char c in ransomNote){
            if(!mag.ContainsKey(c)  || mag[c]==0)return false;
            else mag[c]--;   
         }
        return true;
    }
}