package CCC_12;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		if (n < 4) {
			System.out.println(0);
		} else if (n == 4) {
			System.out.println(1);
		} else {
			for (int i = 1; i < n; i++) {
				for (int j = 2; j < n; j++) {
					for (int x = 3; x < n; x++) {
							if (i < j && j < x && x < n) {
								count++;
							
						}
					}
				}
			}
			System.out.println(count);
		}
		
		
	}

}
