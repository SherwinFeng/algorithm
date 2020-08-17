package main.双指针;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: TODO
 * @date Date : 2020年08月16日 19:18
 */

public class P633_SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        //目的是找到平方和等于c的两个数 假设b是较大的那一个数 那么b一定小于c的开平方
        int a = 0, b = (int)Math.sqrt(c);
        while (a <= b){
            int tmp = a * a + b * b;
            if(tmp == c) {
                return true;
            }else if(tmp < c){
                a++;
            }else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        P633_SumOfSquareNumbers test = new P633_SumOfSquareNumbers();
        test.judgeSquareSum(5);
    }
}
