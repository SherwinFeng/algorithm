package main.排序;

import javafx.util.Pair;

import java.util.*;


/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序
 * @Description:
 * @date Date : 2020年08月18日 17:35
 */

public class P347_topK_1 {

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //1. 统计各个数字出现的频率
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //2. 将<num, frequecy>存在list中
        List<Pair<Integer,Integer>> list = new ArrayList<>();
        for(Integer key : map.keySet()){
            list.add(new Pair<>(key, map.get(key)));
        }
        //3. 对list按照频率降序排列
        //使用lambda表达式 如果->后是expression 直接return计算得到的值，如果需要更复杂方法则需要用{}
        list.sort((Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) ->
                o2.getValue() - o1.getValue()
        );
        //4. 存储list前k个元素到结果数组中，返回
        int[] ret = new int[k];
        for(int i = 0; i < k; i++){
            ret[i] = list.get(i).getKey();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ret = topKFrequent(new int[]{1,1,1,2,2,3},2);
        System.out.print(Arrays.toString(ret));
    }


}
