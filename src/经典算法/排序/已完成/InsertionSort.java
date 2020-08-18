package 经典算法.排序.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 插入排序
 *               从前后往后扫描，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
 *               在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 *               改进思路：查找插入位置时可以用二分查找 即在一个有序数组中找到第一个target的下界 找上界就不稳定了
 * @date Date : 2020年08月17日 14:00
 */

public class InsertionSort {

    static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]) continue;
            int k = i;
            while (k > 0 && arr[k] < arr[k - 1]){
                int tmp = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = tmp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

}




















