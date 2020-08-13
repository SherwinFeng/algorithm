package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package PACKAGE_NAME
 * @Description:
 * @date Date : 2020年08月07日 15:06
 */

public class P69_开平方 {
    public int mySqrt(int x) {
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long tmp = (long) mid * mid;
            if (tmp == x) {
                return mid;
            } else if (tmp > x) {
                h = mid - 1;
            } else if (tmp < x) {
                l = mid + 1;
            }
        }
        return h;

    }
}
