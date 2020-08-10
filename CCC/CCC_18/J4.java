package CCC_18;

import java.util.Arrays;
import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean c = true;
		int l = in.nextInt();
		int s[][] = new int[l][l];
		for (int i = 0; i < l; i++) {
			String temp = in.nextLine();
			if (i == 0)
				temp = in.nextLine();
			String[] num = temp.split(" ");
			for (int j = 0; j < l; j++) {
				s[i][j] = Integer.parseInt(num[j]);
			}
		}
		int rotate = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 1; j < l; j++) {
				if (s[i][j] < s[i][j - 1]) {
					continue;
				} else {
					
				}
			}
		}
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (j != l - 1)
					System.out.print(s[i][j] + " ");
				else {
					System.out.println("");
				}
			}
		}
	}

	static void rotate(int s[][]) {
		int c[] = {s[0][0], s[0][s.length - 1], s[s.length - 1][0], s[s.length - 1][s.length - 1]};
		int corner = 0;
		for (int i = 1; i < c.length; i++) {
			if (c[i-1] < c[i]) {
				corner = i;
			}
		}
		if (corner < 3) {
			
		}
	}
}
