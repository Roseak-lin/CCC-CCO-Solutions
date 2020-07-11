package CCC_16;

import java.util.Arrays;
import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int c = in.nextInt();
		int dmoj[] = new int[c];
		int leg[] = new int[c];
		boolean a[] = new boolean[c];
		for (int i = 0; i < c; i++) {
			dmoj[i] = in.nextInt();
		}
		for (int i = 0; i < c; i++) {
			leg[i] = in.nextInt();
		}
		Arrays.sort(dmoj);
		Arrays.sort(leg);
		int t = 0;
		if (q == 1) {
			for (int i = 0; i < c; i++) {
				if (dmoj[i] > leg[i]) {
					t += dmoj[i];
				} else {
					t += leg[i];
				}
			}
		} else {
			for (int i = 0; i < c; i++) {
				if (dmoj[i] > leg[c - i - 1]) {
					t += dmoj[i];
				} else {
					t += leg[c-i-1];
				}
			}
			
		}
		System.out.println(t);
		
	}

}
