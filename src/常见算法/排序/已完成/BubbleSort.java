package main.排序.常见算法.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 默认升序
 *               改进思路：标准的冒泡排序总是会比较数组中的每一对元素，即使是完全有序
 *               或者部分有序，这就是可以做出改进的地方
 *               还有第三种优化：见https://github.com/damonare/Sorts
 * @date Date : 2020年08月17日 10:56
 */

public class BubbleSort {

    //最简单的形式
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //改进后的冒泡排序 - 针对数组完成有序
    //设置一个标志位 如果遍历一次 没有发生swap 说明数组有序直接退出
    public static void sort_1(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if (!flag) break;
        }
    }

    //改进后的冒泡排序 - 针对数组部分有序
    //一次迭代后 上一次迭代最后一次发生交换的位置之后的元素应该都是有序的 所以本地迭代最后迭代到那个位置即可
    public static void sort_2(int[] arr) {
        //pos记录当前发生交换的位置（交换的两个元素的前一个元素的下标） 初始化为arr.length - 1
        int pos = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            //last记录上一次迭代时，最后交换的位置
            int last = pos;
            for (int j = 0; j < last; j++) {
                if (arr[j] > arr[j + 1]) {
                    //更新交换位置pos
                    pos = j;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort_2(arr);
        System.out.print(Arrays.toString(arr));
    }
}
















