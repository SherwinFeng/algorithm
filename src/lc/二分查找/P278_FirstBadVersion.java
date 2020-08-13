package main;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月07日 17:03
 */

public class P278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1, h = n;
        while(l < h){
            int mid = l + (h - l) / 2;
            if (isBadVersion(mid)){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean isBadVersion(int n){
        //some code
        return true;
    }
}
