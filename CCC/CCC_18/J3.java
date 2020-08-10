package CCC_18;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int[] d = new int[4];
		int[] c = new int[5];
	
		for (int i = 0; i < 4; i++) {
			d[i] = input.nextInt();
		}
		for (int i = 1; i < 5; i++) {
			c[i] = c[i-1] - d[i-1];
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int r = c[j] - c[i];
				if (r < 0) {
					r*=-1;
				}
					System.out.print(r + " ");
			}
			System.out.println("");
		}
	}
}