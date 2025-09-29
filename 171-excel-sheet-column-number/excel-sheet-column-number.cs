public class Solution {
    public int TitleToNumber(string col) {
          int ans=0;
        for(int i=0;i<col.Length;i++){
            int c=col[i]-'A'+1;
                ans=ans*26+c;
        }
        return ans;
    }
}