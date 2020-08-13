package exam.netease;

import java.util.*;

public class Main_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer> ret = new ArrayList<>(n);
		Set<Integer> set = new HashSet<>(n - m);
		for(int i = 0; i < m; i++){
			int a = scan.nextInt();
			ret.add(a);
			set.add(a);
		}
		List<Integer> arr = new ArrayList<>(n - m);
		for(int i = 1; i <= n; i++){
			if (set.contains(i)) continue;
			arr.add(i);
		}
		int p1 = 0, p2 = 0;
		int arrSize = arr.size();
		int retSize = ret.size();
		while (p1 < retSize && p2 < arrSize){
			if(ret.get(p1) > arr.get(p2)){
				ret.add(p1, arr.get(p2));
				p1++;
				p2++;
				retSize++;
			}else {
				p1++;
			}
		}
		while (p2 < arrSize){
			ret.add(arr.get(p2));
			p2++;
		}
		for(int i = 0; i < n - 1; i++){
			System.out.print(ret.get(i) + " ");
		}
		System.out.println(ret.get(n - 1));
	}
}

//backup
//import java.util.ArrayList;
//		import java.util.List;
//		import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		List<Integer> ret = new ArrayList<>(n);
//		for(int i = 0; i < m; i++){
//			ret.add(scan.nextInt());
//		}
//		List<Integer> arr = new ArrayList<>(n - m);
//		for(int i = 1; i <= n; i++){
//			if (ret.contains(i)) continue;
//			arr.add(i);
//		}
//		int p1 = 0, p2 = 0;
//		while (p1 < ret.size() && p2 < arr.size()){
//			if(ret.get(p1) > arr.get(p2)){
//				ret.add(p1, arr.get(p2));
//				p1++;
//				p2++;
//			}else {
//				p1++;
//			}
//		}
//		while (p2 < arr.size()){
//			ret.add(arr.get(p2));
//			p2++;
//		}
//		for(int i = 0; i < n - 1; i++){
//			System.out.print(ret.get(i) + " ");
//		}
//		System.out.println(ret.get(n - 1));
//	}
//}