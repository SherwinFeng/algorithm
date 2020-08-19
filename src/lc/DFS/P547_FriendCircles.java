package main.DFS;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.DFS
 * @Description: TODO
 * @date Date : 2020年08月19日 15:13
 */

public class P547_FriendCircles {

    public int findCircleNum(int[][] M) {
        int n = M.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                //每次最顶层的dfs可以求出一个朋友圈
                dfs(M, vis, i);
                cnt++;
            }
        }
        return cnt;
    }

    void dfs(int[][] M, boolean[] vis, int i){
        int n = M.length;
        //标记
        vis[i] = true;
        //尝试所有可能性
        for(int k = 0; k < n; k++){
            if(!vis[k] && M[i][k] == 1) {
                dfs(M, vis, k);
            }
        }
    }

}
