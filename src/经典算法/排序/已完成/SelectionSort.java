package 经典算法.排序.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 复杂度稳定在O(n^2) 每次迭代选出出最小的元素放到开头
 * @date Date : 2020年08月17日 10:56
 */

public class SelectionSort {

    static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //minIndex是交换位置 即每次迭代时最小元素所在的位置
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
