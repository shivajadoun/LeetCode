class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i]<=s[j]){
                    cnt++;
                    s[j]=-1;
                    break;
                }
            }
        }
        return cnt;
        
    }
}