package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月11日 13:42
 */

public class P153_在旋转数组中找到旋转点 {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int l = 0, h = nums.length - 1;
        while (l < h && nums[l] > nums[h]){
            int mid = (h - l) / 2 + l;
            if (nums[mid] > nums[h]){
                l = mid + 1;
            }else if(nums[mid] < nums[l]){
                h = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        P153_在旋转数组中找到旋转点 test = new P153_在旋转数组中找到旋转点();
        System.out.print(test.findMin(new int[]{3,4,5,1,2}));
    }
}
