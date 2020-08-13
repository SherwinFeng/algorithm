package main;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 前缀和 + 二分查找
 * @date Date : 2020年08月12日 10:09
 */

public class P209_长度最小的子数组_2 {

    //ref:https://leetcode-cn.com/problems/minimum-size-subarray-sum/solution/chang-du-zui-xiao-de-zi-shu-zu-by-leetcode-solutio/
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int[] sums  = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        for(int i = 1; i < n + 1; i++){
            //右边界满足： sums[bound] - sums[i - 1] >= s
            //内置的binarySearch就是普通的二分查找 如果没有找到返回值是-(low + 1), 而要求的右边界是low
            int bound = Arrays.binarySearch(sums, sums[i - 1] + s);
            if (bound < 0){
                bound = -bound - 1;
            }
            if (bound <= n){
                ans = Math.min(ans, bound - i + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        P209_长度最小的子数组_2 test = new P209_长度最小的子数组_2();
        System.out.print(test.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}