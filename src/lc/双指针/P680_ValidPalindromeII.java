package main.双指针;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: 关键在于删除字符后如何处理两个指针
 *               如果考虑各种情况，就需要分析什么时候移动p1 什么时候移动p2
 *               不如转变一下思路，即不管怎么处理，两个指针总有一个往中间移动一位
 *               那么干脆不判断，直接判断两种情况是否有一种得到字符为回文即可
 *               从时间复杂度效果考虑都是O(n)
 * @date Date : 2020年08月16日 19:47
 */

public class P680_ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
        while (p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
               return isPalindrome(s, p1, p2-1) || isPalindrome(s, p1 + 1, p2);
            }
            p1++;
            p2--;
        }
        return true;
    }

    boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
