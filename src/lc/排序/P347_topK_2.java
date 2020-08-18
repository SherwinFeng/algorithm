package main.排序;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.排序
 * @Description: 使用桶排
 *              每个桶存储出现频率相同的数。桶的下标表示数出现的频率，即第 i 个桶中存储的数出现的频率为 i。
 *              把数都放到桶之后，从后向前遍历桶，最先得到的 k 个数就是出现频率最多的的 k 个数。
 * @date Date : 2020年08月18日 18:16
 */

public class P347_topK_2 {

    static List<Integer> topKFrequent(int[] nums, int k) {
        //统计单词出现的频率
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //桶排序
        List<Integer>[] buckets = new List[nums.length - 1];
        for(int num : map.keySet()){
            int cnt = map.get(num);
            if(buckets[cnt] == null)
                buckets[cnt] = new ArrayList<>();
            buckets[cnt].add(num);
        }

        //倒序输出
        List<Integer> ret = new ArrayList<>();
        for(int i = nums.length - 1; i > 0 && ret.size() < k; i--){
            if(buckets[i] == null) continue;
            //k - ret.size()表示还需要填充多少个数
            if(buckets[i].size() <= k - ret.size()){
                ret.addAll(buckets[i]);
            }else {
                ret.addAll(buckets[i].subList(0, k - ret.size()));
            }
        }
        return ret;
    }
}