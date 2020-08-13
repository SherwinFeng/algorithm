package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月12日 11:25
 */

public class P240_SearchIn2DMatrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int m = 0, n = columns - 1;
        while (m < rows && n >= 0){
            if (matrix[m][n] == target) return true;
            if (matrix[m][n] > target){
                n--;
            }else {
                m++;
            }
        }
        return false;
    }
}
