package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月07日 15:54
 */

public class P35_搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h){
            int mid = l + (h - l) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                l = mid + 1;
            }else if (nums[mid] > target){
                h = mid - 1;
            }
        }
        return l;
    }
}
