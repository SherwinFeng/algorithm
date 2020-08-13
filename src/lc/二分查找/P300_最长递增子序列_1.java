package main;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 动态规划 l代表以当前数结尾的LIS长度
 *              l[i] = max(l[j]) + 1, j < i且nums[i] > nums[j]
 * @date Date : 2020年08月12日 14:03
 */

public class P300_最长递增子序列_1 {

    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        for(int i = 1; i < nums.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if (nums[i] > nums[j]){
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }
        int max = 1;
        for(int tmp : arr){
            max = Math.max(max, tmp);
        }
        return max;
    }
}
