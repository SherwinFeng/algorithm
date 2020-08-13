package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 14:04
 */

public class P34_有序数组中找到重复元素的开始结束位置 {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int l = findBegin(nums, target);
        int h = findEnd(nums, target);
        if (l == -1) return new int[]{-1, -1};
        return new int[]{l, h};
    }

    int findBegin(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l < nums.length && nums[l] == target ? l : -1;
    }

    int findEnd(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return h >= 0 && nums[h] == target ? h : -1;
    }
}
