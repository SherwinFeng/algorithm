package lc.二分查找;

import java.util.ArrayList;
import java.util.List;

/**
 * 逆向思考：正向要先找到一个大于等于x的元素，然后向两边扩张，但还要判断其他边界条件，较为繁琐
 * -> 要找到k个和x相邻的元素，可以转换为删除n - k个元素，因为数组有序删除的元素一定在头尾
 * 此题还有二分法 过于复杂没看
 */
public class P658_FindKClosestElements_1 {

	//ref: https://www.cnblogs.com/grandyang/p/7519466.html
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int p1 = 0, p2 = arr.length - 1;
		int cnt = arr.length - k;
		List<Integer> ret = new ArrayList<>();
		while (cnt > 0){
			int dist1 = Math.abs(arr[p1] - x);
			int dist2 = Math.abs(arr[p2] - x);
			if (dist1 > dist2) p1++;
			else p2--;
			cnt--;
		}
		for(int i = p1; i <= p2; i++){
			ret.add(arr[i]);
		}
		return ret;
	}

	public static void main(String[] args) {
		P658_FindKClosestElements_1 test = new P658_FindKClosestElements_1();
		System.out.println(test.findClosestElements(new int[]{1,1,1,10,10,10},1,9));
	}
}
