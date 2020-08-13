/*
 * Author:      Sherwin
 * solution:    注意：
 *              1. 用int存储sum时会溢出，所以要用long
 *              2. 1用1L表示可以让结果存为long（低位与高位计算结果是高位类型）
 * problem:
 * time:        2020/07/02 17:26
 */

package lc.二分查找;

public class P441_摆硬币 {

	public int arrangeCoins(int n) {
		int l = 1, h = n;
		while (l <= h){
			int mid = (h - l) / 2 + l;
			long sum = (1L + mid) * mid / 2;
			if (sum == n){
				return mid;
			}
			if (sum > n){
				h = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return h;
	}

}
