package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月12日 14:46
 */

public class P349_求两个数组的交集 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        //set2的作用是避免list中存入重复元素
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num) && !set2.contains(num)){
                list.add(num);
                set2.add(num);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}
