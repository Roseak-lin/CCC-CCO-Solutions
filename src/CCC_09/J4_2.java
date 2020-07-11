package CCC_09;

import java.util.ArrayList;
import java.util.Scanner;

public class J4_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String arr[] = { "WELCOME.", "TO.", "CCC.", "GOOD.", "LUCK.", "TODAY" };
		int lim = in.nextInt();
		int lim2 = lim;
		ArrayList<String> line = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (lim - arr[i].length() > 0) {
				lim -= arr[i].length();
				line.add(arr[i]);
			} else {
				int j = 0;
				int gaps[] = new int[line.size() - 1];
				if (lim == 0) {
					for (String x : line) {
						System.out.print(x);
					}
				} else {
					while (lim > 0) {
						gaps[j]++;
						j++;
						if (j == gaps.length) {
							j = 0;
						}
						lim--;
					}
				}
				j = 0;
				for (int x = 0; x < line.size() - 1; x++) {
					System.out.print(line.get(x));
					while (gaps[j] > 0) {
						System.out.print(".");
						gaps[j]--;
					}
					j++;
				}
				System.out.print(line.get(line.size() - 1));
				line.clear();
				lim = lim2;
				System.out.println("");
			}
		}
	}

}
