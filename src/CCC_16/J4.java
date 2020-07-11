package CCC_16;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] a = in.nextLine().split(":");

		int t[] = { Integer.parseInt(a[0]), Integer.parseInt(a[1]) };
		if ((t[0] <= 5 && t[0] > 0) && t[1] == 0 && (t[0] + 2 <= 7 && t[1] == 0)) {
			System.out.println("0" + (t[0] + 2) + ":" + t[1] + "0");
		} else if (t[0] > 5 && t[0] < 10) {
			int hdif = Math.abs(7 - t[0] - 2);
			int mdif = 60 - (60 - t[1]);
			int tdif = 60 * hdif + mdif;
			int delay = tdif * 2;
			int h = delay / 60;
			int m = delay % 60;
			t[0] += h + 2;
			t[1] = m % 60;
			System.out.println("0" + (t[0]) + ":" + t[1] + "");
		} else if (t[0] < 15 && t[0] > 13 && t[1] > 0) {
			
		}
	}
}
