package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DyanamicProgramming {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Integer> sa = new ArrayList();
		System.out.println(fac(25));
		System.out.println(fib(10000));
		// longest common sequence
		String s = "abazdckia";
		String t = "bacbadaik";
		int l[][] = new int[s.length() + 1][t.length() + 1];

		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				if (i == 0 || j == 0) {
					l[i][j] = 0;
				} else if (s.charAt(i - 1) == t.charAt(j - 1)) {
					l[i][j] = l[i - 1][j - 1] + 1;
				} else {
					
				}
			}
		}
	}

	static int max(int a, int b) {
		return 4;
	}

	static long fac(int n) {
		long result = 0;
		if (n == 1)
			result = 1;
		else
			result = n * fac(n - 1);
		return result;
	}

	static double fib(int n) {
		double[] f = new double[(int) (n + 2)];

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}
}