package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 双指针 还有前缀和+二分的解法
 * @date Date : 2020年08月11日 14:08
 */

public class P209_长度最小的子数组_1 {

    //ref：https://leetcode-cn.com/problems/minimum-size-subarray-sum/solution/chang-du-zui-xiao-de-zi-shu-zu-by-leetcode-solutio/
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0, end = 0;
        while (end < nums.length){
            sum += nums[end];
            while (sum >= s){
                ans = Math.min(ans, end -start + 1);
                //注意需要先减 再移动指针
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        P209_长度最小的子数组_1 test = new P209_长度最小的子数组_1();
        System.out.print(test.minSubArrayLen(15, new int[]{1,2,3,4,5}));
    }
}
