class Solution {
    public long coloredCells(int n) {
        if(n==1)return 1;
        long ans=1;
        int i=2;
        while(i<=n){
            ans+=(i-1)*4;
            i++;
        }
        return ans;
    }
}