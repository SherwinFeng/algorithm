package main;

import java.util.Arrays;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 15:52
 */

public class p475_加热器 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans = 0;
        for(int house : houses){
            int idx = Arrays.binarySearch(heaters, house);
            if(idx < 0){
                idx = -idx - 1;
            }
            int distLeft = idx == 0 ? Integer.MAX_VALUE : house - heaters[idx - 1];
            int distRight = idx == heaters.length ? Integer.MAX_VALUE : heaters[idx] - house;
            ans = Math.max(ans, Math.min(distLeft, distRight));
        }
        return ans;
    }
}
