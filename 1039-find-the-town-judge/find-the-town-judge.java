public class Solution {
    public int findJudge(int n, int[][] t) {
        if (t.length == 0) return (n == 1) ? 1 : -1;

        int[] trustScores = new int[n + 1]; 

        for (int[] pair : t) {
            trustScores[pair[0]]--; 
            trustScores[pair[1]]++; 
        }

        int judge = -1; 

        for (int i = 1; i <= n; ++i) {
            if (trustScores[i] == n - 1) {
                if (judge != -1) return -1; 
                judge = i; 
            }
        }

        return judge;
    }
}