package lc.二分查找;

import java.util.HashMap;

/**
 *  A[i] + B[j] + C[k] + D[l] = 0 可以转换成A[i] + B[j] = -(C[k] + D[l])
 *  用一个map保存A[i] + B[j]的各种和 以及 出现频次
 *  在C D中求各种和看map中是否存在相反数，存在则累加频次
 */
public class P454_4SumII {

	//ref: https://leetcode.com/problems/4sum-ii/discuss/175783/Hash-Java-with-Explanations
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		// key: sum, value: frequency of sum.
		HashMap<Integer, Integer> map = new HashMap<>();
		int ret = 0;
		int n = A.length;
		// Get all possible two-sums between A and B.
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int sum = A[i] + B[j];
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
		}
		// Count the number of two-sums between C and D that equals to opposite of any two-sum between A and B
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int sum = C[i] + D[j];
				if(map.containsKey(-sum)){
					ret += map.get(-sum);
				}
			}
		}
		return ret;
	}
}
