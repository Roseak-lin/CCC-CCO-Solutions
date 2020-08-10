package CCC_08;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();

		if (a / (b * b) > 25) {
			System.out.println("Overweight");
		} else if (a / (b * b) <= 25 && a / (b * b) >= 18.5) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}

	}

}
