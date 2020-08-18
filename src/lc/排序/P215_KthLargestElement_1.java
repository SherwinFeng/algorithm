package main.排序;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序
 * @Description: 快速选择
 * @date Date : 2020年08月18日 16:35
 */

public class P215_KthLargestElement_1 {

    static int findKthLargest(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        int pos;
        while (true){
            pos = partition(nums, l, h);
            if(pos == k - 1) return nums[pos];
            if(pos < k - 1) l = pos + 1;
            if(pos > k - 1) h = pos - 1;
        }
    }

    static int partition(int[] nums, int l, int h){
        int i = l, j = h;
        //pivot是基准元素
        int pivot = nums[l];
        while (i < j){
            while (i < j && nums[j] <= pivot){
                j--;
            }
            if(i < j){
                swap(nums, i, j);
                i++;
            }
            while (i < j && nums[i] >= pivot){
                i++;
            }
            if(i < j){
                swap(nums, i, j);
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
        System.out.print(findKthLargest(new int[]{7,6,5,4,3,2,1}, 2));
    }
}
