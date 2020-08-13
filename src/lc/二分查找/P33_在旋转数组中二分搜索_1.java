package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月07日 18:27
 */

public class P33_在旋转数组中二分搜索_1 {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int pivot = getPivot(nums);
        int l, h;
        if(pivot == 0){
            l = 0;
            h = nums.length - 1;
        }else {
            if (target >= nums[0]) {
                l = 0;
                h = pivot - 1;
            } else {
                l = pivot;
                h = nums.length - 1;
            }
        }
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    int getPivot(int[] arr) {
        int l = 0, h = arr.length - 1;
        while (l < h && arr[l] > arr[h]) {
            int mid = (h - l) / 2 + l;
            if (arr[l] > arr[mid]) {
                h = mid;
            } else if (arr[h] < arr[mid]) {
                l = mid + 1;
            }
        }
        return l;
    }
}
