package CCC_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(in.readLine());
		String text = in.readLine();
		int t = 0;
		int s = 0;

		for (int i = 0; i < r - 1; i++) {
			String temp[] = text.split("");
			for (int j = 0; j < temp.length; j++) {

				if (temp[j].equalsIgnoreCase("s")) {
					s++;
				} else if (temp[j].equalsIgnoreCase("t")) {
					t++;
				}
			}
			text = in.readLine();
		}
		if (t > s)
			System.out.println("English");
		else if (t < s)
			System.out.println("French");
		else if (t == s) {
			System.out.println("English");
		}
	}
}
