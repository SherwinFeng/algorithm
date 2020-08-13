package exam.netease;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++){
			int n = scan.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for(int j  = 0; j < n; j++){
				arr[j] = scan.nextInt();
				sum += arr[j];
			}
			System.out.println(helper(arr, sum));
		}
	}

	static int helper(int[] arr, int sum){
		Arrays.sort(arr);
		return 1;
	}
}
