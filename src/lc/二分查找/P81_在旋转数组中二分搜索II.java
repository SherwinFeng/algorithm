package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月11日 10:26
 */

public class P81_在旋转数组中二分搜索II {

    //ref： https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/solution/zai-javazhong-ji-bai-liao-100de-yong-hu-by-reedfan/
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = (h - l) / 2 + l;
            if (nums[mid] == target) return true;
            if (nums[mid] == nums[l]){
                l++;
                continue;
            }
            if (nums[mid] >= nums[l]) {
                if (target >= nums[l] && target <= nums[mid]) {
                    h = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[h]) {
                    l = mid;
                } else {
                    h = mid - 1;
                }
            }
        }
        return false;
    }
}
