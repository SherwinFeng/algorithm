package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 14:31
 */

public class P392_IsSubsequence_2 {

    //ref:https://leetcode.com/problems/is-subsequence/discuss/87302/Binary-search-solution-for-follow-up-with-detailed-comments
    //https://www.cnblogs.com/grandyang/p/5842033.html
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        //idx记录了t中每个字符出现的下标，相同字符的下标组织成了一个有序列表
        List<Integer>[] idx = new List[256];
        for(int i = 0; i < t.length(); i++){
            if (idx[t.charAt(i)] == null){
                idx[t.charAt(i)] = new ArrayList<>();
            }
            idx[t.charAt(i)].add(i);
        }
        int pre = 0;
        for(int i = 0; i < s.length(); i++){
            if (idx[s.charAt(i)] == null) return false;
            //upper是一个有序数组（升序）中第一个大于等于pre的元素的下标，即上界
            // 这里也是贪心的体现，如果要尽可能地满足子序列，那么每次的上界应该尽量小，所以是第一个
            int upper = Collections.binarySearch(idx[s.charAt(i)], pre);
            if(upper < 0) {
                upper = -upper - 1;
            }
            //upper超出了列表最大下标 一定是没找到上界
            if(upper == idx[s.charAt(i)].size()) return false;
            //更新pre 因为子序列要求不能打乱顺序 所以s中后面的字符在t中的下标一定要大于之前的字符
            pre = idx[s.charAt(i)].get(upper) + 1;
        }
        return true;
    }
}
