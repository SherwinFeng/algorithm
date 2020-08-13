package main;

import java.util.PriorityQueue;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 直接用堆/优先队列实现 PriorityQueue默认是升序排列
 * @date Date : 2020年08月13日 10:08
 */

public class P378_有序矩阵的第k小元素_1 {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                q.add(matrix[i][j]);
            }
        }
        while (k > 1){
            q.poll();
            k--;
        }
        return q.poll();

    }
}
