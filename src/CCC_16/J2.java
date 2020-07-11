package CCC_16;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] r1 = new int[4];
		int[] r2 = new int[4];
		int[] r3 = new int[4];
		int[] r4 = new int[4];
		for (int i = 0; i < 4; i++) {
			r1[i] = in.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			r2[i] = in.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			r3[i] = in.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			r4[i] = in.nextInt();
		}

		int t1 = r1[0] + r2[0] + r3[0] + r4[0];
		int t2 = r1[1] + r2[1] + r3[1] + r4[1];
		int t3 = r1[2] + r2[2] + r3[2] + r4[2];
		int t4 = r1[3] + r2[3] + r3[3] + r4[3];

		int d1 = r1[0] + r1[1] + r1[2] + r1[3];
		int d2 = r2[0] + r2[1] + r2[2] + r2[3];
		int d3 = r3[0] + r3[1] + r3[2] + r3[3];
		int d4 = r4[0] + r4[1] + r4[2] + r4[3];
		if (t1 == t2 && t1 == t3 && t1 == t4 && t1 == d1 && t1 == d2 && t1 == d3 && t1 == d4) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
	}
}
