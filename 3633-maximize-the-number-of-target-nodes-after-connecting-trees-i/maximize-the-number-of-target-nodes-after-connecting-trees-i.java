import java.util.*;

class Solution {
    private int dfs(int node, int k, List<List<Integer>> adj, boolean[] vis, int par) {
        vis[node] = true;
        int cnt = 1;
        if (k > 0) {
            for (int nei : adj.get(node)) {
                if (nei != par) {
                    cnt += dfs(nei, k - 1, adj, vis, node);
                }
            }
        }
        return cnt;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n1 = edges1.length + 1;
        int n2 = edges2.length + 1;

        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();

        for (int i = 0; i < n1; i++) adj1.add(new ArrayList<>());
        for (int i = 0; i < n2; i++) adj2.add(new ArrayList<>());

        for (int[] edge : edges1) {
            int u = edge[0], v = edge[1];
            adj1.get(u).add(v);
            adj1.get(v).add(u);
        }

        for (int[] edge : edges2) {
            int u = edge[0], v = edge[1];
            adj2.get(u).add(v);
            adj2.get(v).add(u);
        }

        if (k == 0) {
            int[] result = new int[n1];
            Arrays.fill(result, 1);
            return result;
        }

        int max = 0;
        for (int i = 0; i < n2; i++) {
            boolean[] vis = new boolean[n2];
            int cnt = dfs(i, k - 1, adj2, vis, -1);
            max = Math.max(max, cnt);
        }

        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            boolean[] vis = new boolean[n1];
            int cnt = dfs(i, k, adj1, vis, -1);
            ans[i] = cnt + max;
        }

        return ans;
    }
}
