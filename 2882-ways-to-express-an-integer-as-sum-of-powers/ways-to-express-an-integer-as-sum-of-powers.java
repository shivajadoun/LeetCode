class Solution {
    int MOD = 1000000007;
    int[][] dp;

    public int numberOfWays(int n, int x) {
        dp = new int[301][301];
        for (int[] d : dp) Arrays.fill(d, -1);
        return solve(1, n, x, 0);
    }

    public int solve(int idx, int n, int x, int sum) {
        if (sum == n) return 1;       
        if (sum > n) return 0;         // overshoot
        if (idx > n) return 0;         // no more numbers

        if (dp[idx][sum] != -1) return dp[idx][sum];

        int pow = (int) Math.pow(idx, x);
        if (pow > n) return dp[idx][sum] = 0;

        int pick = solve(idx + 1, n, x, sum + pow);
        int notPick = solve(idx + 1, n, x, sum);

        return dp[idx][sum] = (int) (((long) pick + notPick) % MOD);
    }
}
