class Solution {
    public int minPathSum(int[][] arr) {
         int m=arr.length;
         int n=arr[0].length;
         for(int i=1;i<m;i++){
            arr[i][0]+=arr[i-1][0];
         }
          for(int i=1;i<n;i++){
            arr[0][i]+=arr[0][i-1];
         }
         for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int min=Math.min(arr[i][j-1],arr[i-1][j]);
                arr[i][j]+=min;
            }
         }
         return arr[m-1][n-1];

    }
}