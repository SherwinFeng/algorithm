package main.BFS;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.BFS
 * @Description: TODO
 * @date Date : 2020年08月19日 14:07
 */

public class P1091_01矩阵中的最短路径 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(n == 1 && grid[0][0] == 0) return 1;
        if(grid[0][0] != 0 || grid[n - 1][n - 1] != 0) return -1;
        int[][] dxy = {{0,1},{0,-1},{1,0},{1,-1},{1,1},{-1,0},{-1,1},{-1,-1}};
        int[][] vis = new int[n][n];
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(0,0,1));
        //标记访问 只要把节点加入队列就要标记已访问
        vis[0][0] = 1;
        while (!q.isEmpty()){
            Position p = q.poll();
            int sx = p.x;
            int sy  = p.y;
            int step = p.step;
            for(int i = 0; i < 8; i++){
                int nx = dxy[i][0] + sx;
                int ny = dxy[i][1] + sy;
                int nStep = step + 1;
                //边界检查
                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                //检查是否访问过以及能否通行
                if(vis[nx][ny] == 1 || grid[nx][ny] == 1) continue;
                //bfs的性质：第一次访问到的就是最短路径
                if(nx == n - 1 && ny == n - 1) return nStep;
                q.offer(new Position(nx, ny, nStep));
                //标记访问
                vis[nx][ny] = 1;
            }
        }
        return -1;
    }

    class Position{
        int x;
        int y;
        int step;
        public Position(int x, int y, int step){
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

}




