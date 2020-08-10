package CCC_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());

		int count = 0;
		int h = 12;
		int m = 0;

		if (a >= 1440) {
			for (int i = 0; i <= a - (1440 * (a / 1440)); i++) {
				int time[] = new int[4];
				if (h >= 10) {
					time[0] = 1;
				} else {
					time[0] = 0;
				}
				if (h >= 10) {
					time[1] = h - 10;
				} else {
					time[1] = h;
				}
				if (m >= 10) {
					time[2] = Math.round(m / 10);
				} else {
					time[2] = 0;
				}
				if (m >= 10) {
					time[3] = m - (time[2] * 10);
				} else {
					time[3] = m;
				}

				if (h < 10 && time[3] - time[2] == time[2] - time[1]) {
					count++;
				} else if (time[3] - time[2] == time[2] - time[1] && time[2] - time[1] == time[1] - time[0]) {
					count++;
				}
				if (m == 59) {
					if (h == 12) {
						h = 1;
						m = 0;
					} else {
						m = 0;
						h++;
					}
				} else {
					m++;
				}
				if (time[3] + 1 == 10) {
					time[3] = 0;
					time[2]++;
				}

			}
			System.out.println((62 * (a / 1440)) + count);
		} else {
			for (int i = 0; i <= a; i++) {
				int time[] = new int[4];
				if (h >= 10) {
					time[0] = 1;
				} else {
					time[0] = 0;
				}
				if (h >= 10) {
					time[1] = h - 10;
				} else {
					time[1] = h;
				}
				if (m >= 10) {
					time[2] = Math.round(m / 10);
				} else {
					time[2] = 0;
				}
				if (m >= 10) {
					time[3] = m - (time[2] * 10);
				} else {
					time[3] = m;
				}

				if (h < 10 && time[3] - time[2] == time[2] - time[1]) {
					count++;
				} else if (time[3] - time[2] == time[2] - time[1] && time[2] - time[1] == time[1] - time[0]) {
					count++;
				}
				if (m == 59) {
					if (h == 12) {
						h = 1;
						m = 0;
					} else {
						m = 0;
						h++;
					}
				} else {
					m++;
				}
				if (time[3] + 1 == 10) {
					time[3] = 0;
					time[2]++;
				}
			}
			System.out.println(count);
		}
	}

}
