package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 排序后用双指针
 * @date Date : 2020年08月07日 17:31
 */

public class P350_求两个数组的交集 {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ret = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;
        int n1 = nums1.length, n2 = nums2.length;
        while (p1 < n1 && p2 < n2){
            if (nums1[p1] == nums2[p2]){
                ret.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1] < nums2[p2]){
                p1++;
            }else if(nums1[p1] > nums2[p2]){
                p2++;
            }
        }
        int[] arr = new int[ret.size()];
        for(int i = 0; i < ret.size(); i++){
            arr[i] = ret.get(i);
        }
        return arr;
    }
}










