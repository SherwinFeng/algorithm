package main.双指针;


/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: TODO
 * @date Date : 2020年08月16日 19:33
 */

public class P345_反转元音字母 {

    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) return "";
        char[] arr = s.toCharArray();
        int p1 = 0, p2 = s.length() - 1;
        while (p1 < p2){
            if(isVowel(arr[p1]) && isVowel(arr[p2])){
                char tmp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = tmp;
                p1++;
                p2--;
            }else if(!isVowel(arr[p1])){
                p1++;
            }else {
                p2--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            sb.append(c);
        }
        return sb.toString();
    }

    boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        P345_反转元音字母 test = new P345_反转元音字母();
        test.reverseVowels("hello");
    }
}
