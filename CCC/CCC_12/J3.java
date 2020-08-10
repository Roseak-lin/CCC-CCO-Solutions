package CCC_12;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < a; i++) {
				System.out.print("x");
			}
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < a; i++) {
				System.out.print("x");
			}
			for (int i = 0; i < a; i++) {
				System.out.print("x");
			}
			System.out.println("");
		}
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < a; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
