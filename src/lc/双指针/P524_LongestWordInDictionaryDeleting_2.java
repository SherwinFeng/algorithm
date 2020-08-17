package main.双指针;


import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: 用indexOf函数代替双指针
 * @date Date : 2020年08月17日 10:49
 */

public class P524_LongestWordInDictionaryDeleting_2 {

    public String findLongestWord(String s, List<String> d) {
        String res = ""; //返回的字符串
        int longest = 0; //匹配到的字符串的最大长度
        for(String str : d){
            boolean flag = true; //代表是否当前字典的单词是否和s匹配
            int last = 0; //下一次匹配开始的位置
            for(int i = 0; i < str.length(); i++){
                int index = s.indexOf(str.charAt(i), last);
                if(index == -1){
                    flag = false;
                    break;
                }
                last = index + 1;
            }
            if(flag){
                if(str.length() > longest){
                    longest = str.length();
                    res = str;
                }else if(str.length() == longest){
                    res = (res.compareTo(str) < 0 ? res : str);
                }
            }
        }
        return res;
    }
}
