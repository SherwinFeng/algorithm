package main.DFS;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.DFS
 * @Description: TODO
 * @date Date : 2020年08月19日 14:57
 */

public class P695_MaxAreaOfIsland {

    static int n, m;

    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) c = Math.max(c, dfs(i, j, grid));
            }
        }
        return c;
    }

    int dfs(int x, int y, int[][] grid) {
        if (x >= n || x < 0 || y >= m || y < 0) return 0;
        if (grid[x][y] == 0) return 0;
        //标记已访问
        grid[x][y] = 0;
        return dfs(x + 1, y, grid) + dfs(x - 1, y, grid) + dfs(x, y + 1, grid) + dfs(x, y - 1, grid) + 1;
    }
}
