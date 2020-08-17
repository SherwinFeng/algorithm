package lc.二分查找;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月07日 18:27
 */

public class P33_在翻转数组中二分搜索 {

	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) return -1;
		int pivot = getPivot(nums);
		int l = 0, h = 0;
		if (pivot == 0) {
			//没有翻转的情况 完全有序
			l = 0;
			h = nums.length - 1;
		} else {
			if (target >= nums[0]) {
				//target可能在左半边
				l = 0;
				h = pivot - 1;
			} else {
				//target可能在右半边
				l = pivot;
				h = nums.length - 1;
			}
		}
		//常规的二分搜索
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return -1;
	}

	int getPivot(int[] arr) {
		//寻找翻转点 翻转点定义为右半边的第一个元素的下标
		int l = 0, h = arr.length - 1;
		while (l < h && arr[l] > arr[h]) {
			int mid = l + (h - l) / 2;
			if (arr[l] > arr[mid]) {
				h = mid;
			} else if (arr[h] < arr[mid]) {
				l = mid + 1;
			}
		}
		return l;
	}
}
