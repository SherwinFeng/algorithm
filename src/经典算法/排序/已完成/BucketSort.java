package 经典算法.排序.已完成;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序.常见算法
 * @Description: 桶排序
 *               一、步骤：
 *               1.初始化桶数组, 每个bucket是一个list，包括初始化桶的数量、初始化bucket
 *               2.将待排序的元素映射到不同的bucket中(scatter)
 *               3.对每个非空的bucket中的元素进行排序
 *               4.按顺序访问bucket，将元素放回与原数组中（gather）
 *               二、影响性能的因素：
 *               1.映射函数/哈希函数的设计，应该尽量保证每个桶中的元素尽可能少，但同时也会带来空间消耗
 *               2.元素的分布
 *               三、与计数排序的对比
 *               1.计数排序没有bucket的概念，每个slot存的是出现次数
 *               2.计数排序直接把映射关系设计为 元素值 = 下标
 *               桶排的哈希函数完全自定义
 * @date Date : 2020年08月17日 10:56
 */

//https://knpcode.com/java-programs/bucket-sort-java-program/
//https://en.wikipedia.org/wiki/Bucket_sort
public class BucketSort {

    //size是桶的数量，根据不同的实现也可以不传
    static void sort(int[] arr, int size){
        //1.初始化bucket数组
        List<Integer>[] bucketList = new List[size];
        for(int i = 0; i < size; i++){
            bucketList[i] = new ArrayList<>();
        }
        //2.scatter
        for(int val : arr){
            bucketList[hash(val, size)].add(val);
        }
        //3.sort
        for(List list : bucketList){
            Collections.sort(list);
        }
        //4.gather
        int index = 0;
        for(List<Integer> list : bucketList){
            for(int val : list){
                arr[index++] = val;
            }
        }
    }

    static int hash(int val, int size){
        return val / size;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 0, 9,6,3};
        sort(arr, 10);
        System.out.print(Arrays.toString(arr));
    }

}
















