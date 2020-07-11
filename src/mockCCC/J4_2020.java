package mockCCC;

import java.util.Scanner;

public class J4_2020 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		String lights = in.next();
		int distance = 0;
		for (int i = 0; i < h; i++) {
			if (lights.charAt(i) == '0' ) {
				int f = 1;
				int l = 1;
				int t1 = i, t2 = i;
				while (true) {
					if (lights.charAt(t1) == '1') {
						f = t1;
						break;
					}
					if (t1 == 0) {
						f = 0;
						break;
					}
					t1--;
				}
				while (true) {
					
					if (lights.charAt(t2)  == '1') {
						l = t2;
						break;
					}
					if (t2 == lights.length() - 1) {
						l = 0;
						break;
					}
					t2++;
				}
				//System.out.println(l + " " + f);
				//System.out.println(i - f + " " + Math.abs(i - l));
				if (i - f < Math.abs(i - l)) {
					distance += i - f;
				} else {
					distance += Math.abs(i-1);
				}
			}
		}
		System.out.println(distance);
	}

}
