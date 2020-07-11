package CCC_17;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//
//		int t = in.nextInt();
//		int l[] = new int[t];
//		int h[] = new int[t];
//
//		l[0] = in.nextInt();
//		h[0] = in.nextInt();
//		for (int i = 1; i < t; i++) {
//			int temp = in.nextInt();
//			if (temp < l[0]) {
//				l[i] = in.nextInt();
//			} else {
//				h[i] = in.nextInt();
//			}
//		}
//
//		for (int i = 0; i < t; i++) {
//			
//		}
		long a = 0; 
		long b = 1;
		long num = in.nextLong();
		long arr[] = new long[(int) (num + 2)];
		for (int i = 2; i <= num; i++) {
			arr[i] = a + b;
			a = b;
			b = arr[i];
		}
		System.out.println(arr[(int) num]);
		
	}

}
