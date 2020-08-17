package main.双指针;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: 从尾部开始移动指针 不需要申请额外数组空间
 * @date Date : 2020年08月17日 9:46
 */

public class P88_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, k = m + n - 1;
        while (p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[k] = nums1[p1];
                p1--;
            }else {
                nums1[k] = nums2[p2];
                p2--;
            }
            k--;
        }
        //只需要考虑nums2是因为如果p1如果没有遍历到-1，剩余的部分可以直接作为结果
        while (p2 >= 0){
            nums1[k--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
