class Solution {
    public int matchPlayersAndTrainers(int[] pl, int[] tr) {
           Arrays.sort(pl);
           Arrays.sort(tr);
          int n=pl.length;
          int m=tr.length;
           int i=0;
           int j=0;
           int cnt=0;
           while(i<n && j<m){
                  if(pl[i]<=tr[j]){
                    cnt++;
                    i++;
                  }
                  j++;
           }
           return cnt;
              
    }
}