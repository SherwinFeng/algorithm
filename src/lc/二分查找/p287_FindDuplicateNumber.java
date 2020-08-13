package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 抽屉原理 + 二分, 时间复杂度o(nlgn)
 * @date Date : 2020年08月12日 13:39
 */

public class p287_FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int l = 1, h = nums.length;
        while (l < h) {
            //每次找到中间的数
            //如果重复元素在前半段，那么nums中所有小于等于mid的数的个数一定大于mid
            int mid = l + (h - l) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid){
                    cnt++;
                }
            }
            if (cnt > mid){
                h = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

}
