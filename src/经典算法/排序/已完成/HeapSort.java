package 经典算法.排序.已完成;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法.排序.已完成.未完成
 * @Description: 关键点：
 *               1.调整每个节点，是往下递归的过程（调整父节点后可能会使孩子节点不满足堆性质）
 *               2.初始建堆，是从下往上的过程（从最后一个非叶节点开始调整）
 * @date Date : 2020年08月17日 14:19
 */

//参考：https://java2blog.com/heap-sort-in-java/
public class HeapSort {

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //调整当前节点并递归调整子子节点，使其符合堆的特点
    // curIdx是当前待调整节点 size是当前堆的元素个数
    static void heapify(int[] arr, int curIdx, int size){
        int leftIdx = curIdx * 2 + 1;
        int rightIdx = curIdx * 2 + 2;
        int maxIdx;
        if(leftIdx < size && arr[leftIdx] > arr[curIdx]){
            maxIdx = leftIdx;
        }else {
            maxIdx = curIdx;
        }
        if(rightIdx < size && arr[rightIdx] > arr[maxIdx]){
            maxIdx = rightIdx;
        }
        if(maxIdx != curIdx){
            swap(arr, maxIdx, curIdx);
            heapify(arr, maxIdx, size);
        }
    }

    //初始建堆，从最后一个非叶子节点开始往上
    static void buidHeap(int[] arr){
        for(int i = (arr.length - 1) / 2; i >= 0; i--){
            heapify(arr, i, arr.length);
        }
    }

    static void sort(int[] arr){
        buidHeap(arr);
        for(int sizeOfHeap = arr.length; sizeOfHeap > 0; sizeOfHeap--){
            //交换第一个元素和堆中的最后一个元素
            swap(arr, 0, sizeOfHeap - 1);
            //从第一个元素往下开始堆化
            heapify(arr, 0, sizeOfHeap - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }



}
