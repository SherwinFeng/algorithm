package 经典算法.排序.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: TODO
 * @date Date : 2020年08月17日 10:56
 */

public class MergeSort {

    static void sort(int[] arr, int l, int h){
        if(l == h) return;
        //[l, mid] [mid + 1, h]是两个有序区间
        int mid = (l + h) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }

    static void merge(int[] arr, int l, int mid, int h){
        int[] tmp = new int[h - l + 1];
        int p1 = l, p2 = mid + 1, k = 0;
        while (p1 <= mid && p2 <= h){
            if (arr[p1] <= arr[p2]){
                tmp[k++] = arr[p1++];
            }else {
                tmp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid){
            tmp[k++] = arr[p1++];
        }
        while (p2 <= h){
            tmp[k++] = arr[p2++];
        }
        for(int i = 0; i < k; i++){
            arr[l + i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

}
