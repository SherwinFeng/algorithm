package lc.二分查找;

import java.util.Arrays;

//此题关键在于边界条件的判断 可以带入nums = {5} target分别等于4, 5, 6校验是否越界
public class P34_有序数组中找到元素的起止下标 {

	public int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0) return new int[]{-1, -1};
		int l = findBegin(nums, target);
		int h = findEnd(nums, target);
		if (l == -1) return new int[]{-1, -1};
		return new int[]{l, h};
	}

	int findBegin(int[] nums, int target) {
		//找到重复元素的最左下标
		int l = 0, h = nums.length - 1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (nums[mid] >= target) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		//可以nums = {5} target分别等于4, 5, 6校验 得出边界条件的判断依据 下同
		return l < nums.length && nums[l] == target ? l : -1;
	}

	int findEnd(int[] nums, int target) {
		//找到复元素的最右下标
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

	public static void main(String[] args) {
		P34_有序数组中找到元素的起止下标 test = new P34_有序数组中找到元素的起止下标();
		String arrStr = Arrays.toString(test.searchRange(new int[]{5},4));
		System.out.println(arrStr);
	}
}
