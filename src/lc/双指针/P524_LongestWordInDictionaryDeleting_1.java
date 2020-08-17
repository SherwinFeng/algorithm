package main.双指针;


import java.util.Comparator;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: TODO
 * @date Date : 2020年08月17日 10:24
 */

public class P524_LongestWordInDictionaryDeleting_1 {

    public String findLongestWord(String s, List<String> d) {
        if(s == null || s.length() == 0 || d.size() == 0) return "";
        handleList(d);
        String ret = "";
        //遍历每个待选单词，使用双指针判断s是否能够构成str
        for(String str : d){
            int p1 = 0, p2 = 0;
            while (p1 < s.length() && p2 < str.length()){
                if(s.charAt(p1) == str.charAt(p2)){
                    p1++;
                    p2++;
                }else {
                    p1++;
                }
            }
            if(p2 == str.length()){
                ret = str;
                break;
            }
        }
        return ret;
    }


    //先对单词列表排序，长度长且字典序小的排在前面，这样当找到一个单词符合要求时直接退出循环
    void handleList(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else {
                    return o2.length() - o1.length();
                }
            }
        });
    }
}

















