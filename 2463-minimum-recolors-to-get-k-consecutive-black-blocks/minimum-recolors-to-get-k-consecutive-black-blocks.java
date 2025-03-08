class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int wcnt=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')wcnt++;
        }
        int i=1,l=k;
        int cnt=wcnt;
        while(i<n&&l<n){
            if(blocks.charAt(i-1)=='W')wcnt-=1;
            if(blocks.charAt(l)=='W')wcnt+=1;
            cnt=Math.min(cnt,wcnt);
            i++;l++;
        }
        return cnt;
    }
}