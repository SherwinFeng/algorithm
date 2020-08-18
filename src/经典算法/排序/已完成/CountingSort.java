package 经典算法.排序.已完成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法.排序.已完成.未完成
 * @Description: 计数排序
 *               关键:
 *               在于对count数组的理解，下标是arr数组的元素，值是对应元素出现的次数
 *               k是arr数组的范围[0, k)
 *
 *               优点：线性时间复杂度O(n + k) k是count数组的长度 n是待排序数组的长度
 *               缺点：1.需要预先知道数据的范围 以确定k 2.数据分布很不均匀时会造成较大空间浪费
 *               3.元素必须是整数（因为元素被映射成了count数组的下标）
 * @date Date : 2020年08月17日 14:20
 */

//https://java2blog.com/counting-sort-in-java/
public class CountingSort {

    static List sort(int[] arr, int k) {
        int[] count = new int[k];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (count[i] == 0) continue;
            while (count[i] > 0) {
                ret.add(i);
                count[i]--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 0, 6};
        System.out.print(sort(arr, 10).toString());
    }
}
















