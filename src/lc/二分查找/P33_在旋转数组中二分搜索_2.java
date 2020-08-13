package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 如果中间的数大于等于最左边的数，则左半段是有序的，否则右半段是有序的
 * @date Date : 2020年08月11日 11:05
 */

public class P33_在旋转数组中二分搜索_2 {

    //ref: https://www.cnblogs.com/grandyang/p/4325648.html
    //https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/sou-suo-xuan-zhuan-pai-xu-shu-zu-by-leetcode-solut/
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = (h - l) / 2 + l;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[l]) {
                //如果满足nums[mid] >= nums[l], [l, mid]区间内一定有序
                if (target >= nums[l] && target <= nums[mid]) {
                    //通过前半边的左右边界判断是否target是否在前半边
                    h = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                //否则一定是[mid, h]区间有序
                if (target >= nums[mid] && target <= nums[h]) {
                    //通过右半边的左右边界判断是否target是否在右半边
                    l = mid;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        P33_在旋转数组中二分搜索_2 test = new P33_在旋转数组中二分搜索_2();
        System.out.print(test.search(new int[]{5,1,3}, 2));
    }
}