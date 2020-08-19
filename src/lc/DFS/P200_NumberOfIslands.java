package main.DFS;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.DFS
 * @Description: TODO
 * @date Date : 2020年08月19日 15:46
 */

public class P200_NumberOfIslands {

    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    void dfs(char[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) return;
        if(grid[x][y] == '0')  return;
        //打标记
        grid[x][y] = '0';
        int[][] dxy = {{0,1},{0,-1},{1,0},{-1,0}};
        //尝试每一种可能性
        for(int i = 0; i <4; i++){
            dfs(grid, x + dxy[i][0], y + dxy[i][1]);
        }
    }
}
