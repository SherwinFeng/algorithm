package exam.netease;

import java.util.Scanner;

public class Main_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		int ret = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] >= 2){
				ret += arr[i] / 2;
			}
		}
		System.out.println(ret);


	}
}
