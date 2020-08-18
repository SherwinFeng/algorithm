package 经典算法.排序.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 快排
 *               关键点：递归(退出条件) + 划分/partition + 交换/swap
 *               一般来说，pivot是基准元素，但这里习惯于将pivot当成基准元素的下标 pivotVal作为基准元素的值
 *               优化思路：
 *               1.优化pivot的选取（固定选取 -> 三值取中 每次partition时从low high mid三个位置上的元素中选一个中间值）
 *               2.小数组优化（小数组时没必要用递归 直接插入/选择排序）
 *               3.交换变为插入（交换是三次赋值 只有一次 但是这里一直不理解）
 * @date Date : 2020年08月17日 10:56
 */

public class QuickSort {

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

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
            //注意这里内部是while,不是if!!!!!!
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


    //用三值取中法优化pivotVal的选取
    static int partition_1(int[] arr, int l, int h) {
        int i = l, j = h;
        medianOfThree(arr, l, h);
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

    //通过以下处理，使arr[mid] <= arr[low] <= arr[h] 第一个元素就更可能让左右两边划分得更平均
    static void medianOfThree(int[] arr, int l, int h){
        int mid = (l + h) / 2;
        // 目的：让arr[low] <= arr[high]
        if(arr[l] > arr[h]){
            swap(arr, l, h);
        }
        // 目的：让arr[mid] <= arr[high]
        if(arr[mid] > arr[h]){
            swap(arr, mid, h);
        }
        // 目的： 让arr[low] >= arr[mid]
        if(arr[mid] > arr[l]){
            swap(arr, mid, l);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
