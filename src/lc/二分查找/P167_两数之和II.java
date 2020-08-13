package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月07日 16:09
 */

public class P167_两数之和II {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length - 1;
        int[] ret = new int[2];
        while (l < h) {
            int sum = numbers[l] + numbers[h];
            if (sum == target) {
                return new int[]{l + 1, h + 1};
            } else if (sum < target) {
                l++;
            } else if (sum > target) {
                h--;
            }
        }
        return ret;
    }
}
