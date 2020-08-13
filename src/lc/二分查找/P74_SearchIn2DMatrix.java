package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 和P240相比 条件更特殊 每行的第一个元素都比上一行最后一个元素大 所以可以拉成一维数组 直接用二分
 * @date Date : 2020年08月11日 9:39
 */

public class P74_SearchIn2DMatrix {

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

    public static  void  main(String[] args){
        P74_SearchIn2DMatrix test = new P74_SearchIn2DMatrix();
        int[][] arr = new int[3][4];
        arr[0] = new int[]{1, 3,  5,  7};
        arr[1] = new int[]{10, 11, 16, 20};
        arr[2] = new int[]{23, 30, 34, 50};
        System.out.print(test.searchMatrix(arr,13));
    }
}
