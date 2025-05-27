class Solution {
    public int findCenter(int[][] edges) {
         int ans=0;
         int first= edges[0][0];
         int second=  edges[0][1];
          int first1= edges[1][0];
         int second1=  edges[1][1];
         if(first==first1||first==second1)ans=first;
         else ans=second;
          return ans;
    }
}