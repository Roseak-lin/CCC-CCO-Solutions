package CCC_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class J2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int b = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		ArrayList<String> arr = new ArrayList();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");

		while (b != 4 || n != 1) {
			for (int i = 0; i < n; i++) {
				if (b == 1) {
					Collections.swap(arr, 0, 1);
					Collections.swap(arr, 1, 2);
					Collections.swap(arr, 2, 3);
					Collections.swap(arr, 3, 4);
				} else if (b == 2) {
					Collections.swap(arr, 4, 3);
					Collections.swap(arr, 3, 2);
					Collections.swap(arr, 2, 1);
					Collections.swap(arr, 1, 0);
				} else if (b == 3) {
					Collections.swap(arr, 0, 1);
				}
			}
			b = Integer.parseInt(in.readLine());
			n = Integer.parseInt(in.readLine());
		}
		for (String i: arr) {
			System.out.print(i + " ");
		}
	}

}
