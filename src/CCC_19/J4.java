package CCC_19;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'H') {
				int temp = a[0][0];
				a[0][0] = a[1][0];
				a[1][0] = temp;
				int temp2 = a[0][1];
				a[0][1] = a[1][1];
				a[1][1] = temp2;
			} else {
				int temp = a[0][0];
				a[0][0] = a[0][1];
				a[0][1] = temp;
				int temp2 = a[1][0];
				a[1][0] = a[1][1];
				a[1][1] = temp2;
			}
		}
		for (int i = 0; i < 2; i++)
			System.out.println(a[i][0] + " " + a[i][1]);
		sc.close();
	}

}