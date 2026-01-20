class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 1; i + k <= m && j + k <= n; k++) {

                    int sum = squareSum(mat, i, j, k);

                    if (sum <= threshold) {
                        ans = Math.max(ans, k);
                    } else {
                        break; 
                    }
                }
            }
        }
        return ans;
    }


    private int squareSum(int[][] mat, int r, int c, int k) {
        int sum = 0;
        for (int i = r; i < r + k; i++) {
            for (int j = c; j < c + k; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
