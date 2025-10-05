import java.util.*;

public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;

        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Start DFS from the borders
        for (int i = 0; i < m; i++) dfs(heights, pacific, i, 0);        // left col -> Pacific
        for (int j = 0; j < n; j++) dfs(heights, pacific, 0, j);        // top row -> Pacific

        for (int i = 0; i < m; i++) dfs(heights, atlantic, i, n - 1);   // right col -> Atlantic
        for (int j = 0; j < n; j++) dfs(heights, atlantic, m - 1, j);   // bottom row -> Atlantic

        // Collect cells reachable by both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    // DFS: move from current cell to neighbors that are >= current height (reverse flow)
    private void dfs(int[][] heights, boolean[][] visited, int i, int j) {
        int m = heights.length, n = heights[0].length;
        if (visited[i][j]) return;
        visited[i][j] = true;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || nj < 0 || ni >= m || nj >= n) continue;
            if (visited[ni][nj]) continue;
            // We can move to neighbor only if neighbor's height >= current cell's height
            if (heights[ni][nj] >= heights[i][j]) {
                dfs(heights, visited, ni, nj);
            }
        }
    }
}
