package CCC_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(in.readLine());
		int l = line;
		String phrase[] = { "WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY" };

		int curr = 0;
		int curr2 = 0;

		for (int i = 0; i < phrase.length; i++) {
			if (l - (phrase[i].length() + 1) > 0) {
				if (i == 5) {
					l++;
				}
				l -= phrase[i].length();
				curr++;
			} else {
				int dots[] = new int[curr - curr2];
				if (dots.length == 0) {
					System.out.println(phrase[i]);
					curr++;
					curr2++;
					continue;
				}
				int temp = 0;
				while (l > 0) {
					if (temp >= curr - curr2) {
						temp = 0;
						dots[temp]++;
					} else {
						dots[temp]++;
					}
					temp++;
					l--;
				}
				int temp2 = 0;
				for (int j = curr2; j < curr; j++) {
					System.out.print(phrase[j]);
					while (dots[temp2] > 0) {
						dots[temp2]--;
						System.out.print(".");
					}
					temp2++;
				}
				l = line;
				curr2 = curr;
				System.out.println("");
			}
		}
		// _____________________________________
		l = line;
		int temp = curr2;
		int dots[] = new int[6 - temp];
		for (int i = curr2; i < 6; i++) {
			l -= phrase[i].length();
		}
		if (l > 0) {
			while (l > 0) {
				if (temp > dots.length - 1) {
					temp = 0;
					dots[temp]++;
				} else {
					dots[temp]++;
				}
				temp++;
				l--;
			}
			int temp2 = 0;
			for (int i = curr2; i < phrase.length; i++) {
				System.out.print(phrase[i]);
				while (dots[temp2] > 0) {
					dots[temp2]--;
					System.out.print(".");
				}
				temp2++;
			}
		} else {
			while (temp < 6) {
				System.out.println(phrase[temp]);
				temp++;
			}
		}
	}
}