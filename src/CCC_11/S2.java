package CCC_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(in.readLine());
		int c = 0;
		String a[] = new String[r];
		String a1[] = new String[r];
		for (int i = 0; i < r; i++) {
			a[i] = in.readLine();
		}
		for (int i = 0; i < r; i++) {
			a1[i] = in.readLine();
		}

		for (int i = 0; i < r; i++) {
			if (a[i].equals(a1[i])) {
				c++;
			}
		}
		System.out.println(c);
	}

}
