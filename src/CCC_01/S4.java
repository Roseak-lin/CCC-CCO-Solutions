package CCC_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class S4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		NumberFormat n = new DecimalFormat("0.00");
		double largest = 0;
		for (int i = 0; i < r; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (Math.sqrt(a * a + b * b) > largest) {
				largest = Math.sqrt(a * a + b * b);
			}
		}
		System.out.println(n.format(largest));

	}

}