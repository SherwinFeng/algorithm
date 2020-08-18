package main.排序;

import java.util.PriorityQueue;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序
 * @Description: TODO
 * @date Date : 2020年08月18日 17:30
 */

public class P215_KthLargestElement_2 {

    static int findKthLargest(int[] nums, int k) {
        //默认小顶堆 tips:如果需要大顶堆 传入一个comparator即可 后 - 前
        PriorityQueue<Integer> q = new PriorityQueue<>();
        //堆中维护的始终是当前最大的k个数
        for(int num : nums){
            q.add(num);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.peek();
    }
}