class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
          int ans[]=new int[queries.length];
            for(int k=0;k<queries.length;k++){
                int l=queries[k][0];
                int r=queries[k][1];
                int res=0;
                for(int i=l;i<=r;i++){
                    res^=arr[i];
                }
                ans[k]=res;
            }
            return ans;
    }
}