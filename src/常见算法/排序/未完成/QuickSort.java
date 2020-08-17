package main.排序.常见算法.未完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 未经过优化的快排
 *               关键点：递归(退出条件) + 划分/partition + 交换/swap
 * @date Date : 2020年08月17日 10:56
 */

public class QuickSort {

    static void sort(int[] arr, int l, int h) {
        if (l >= h) return;
        int pivot = partition(arr, l, h);
        sort(arr, l, pivot - 1);
        sort(arr, pivot + 1, h);
    }

    static int partition(int[] arr, int l, int h) {
        int i = l, j = h;
        int pivotVal = arr[l];
        while (i < j){
            while (i < j && arr[j] >= pivotVal){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
                i++;
            }
            while (i < j && arr[i] <= pivotVal){
                i++;
            }
            if(i < j){
                swap(arr, i, j);
                j--;
            }
        }
        return i;
    }

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
