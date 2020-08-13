package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 11:20
 */

public class P378_有序矩阵的第k小元素_2 {

    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length;
        int l = matrix[0][0], h = matrix[rows - 1][cols - 1];
        while (l <= h){
            int mid = (h - l) / 2 + l;
            int col = cols - 1;
            int cnt = 0;
            for(int row = 0; row < rows; row++){
                while (col >= 0 && matrix[row][col] > mid){
                    col--;
                }
                cnt += col + 1;
            }
            if (cnt >= k){
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        P378_有序矩阵的第k小元素_2 test = new P378_有序矩阵的第k小元素_2();
        System.out.print(test.kthSmallest(new int[][]{{-5}}, 1));
    }
}
