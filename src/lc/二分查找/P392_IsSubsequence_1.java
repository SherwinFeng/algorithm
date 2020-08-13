package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 14:07
 */

public class P392_IsSubsequence_1 {

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        int p1 = 0, p2 = 0;
        while (p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
            }else {
                p2++;
            }
        }
        return p1 == s.length();
    }

    public static void main(String[] args) {
        P392_IsSubsequence_1 test = new P392_IsSubsequence_1();
        System.out.print(test.isSubsequence("axc", "ahbgdc"));
    }
}
