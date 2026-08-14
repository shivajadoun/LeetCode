class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length(),res=0;
        int[]f=new int[26];
        for(int i=0, j=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            while(f[s.charAt(i)-'a']>2)
            f[s.charAt(j++)-'a']--;
            res=Math.max(res,i-j+1);
        } 
        return res;
    }
}