package CCC_15;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int d = in.nextInt();
		
		if (m < 2)
			System.out.println("Before");
		else if (m > 2)
			System.out.println("After");
		else if (d < 18)
			System.out.println("Before");
		else if (d > 18)
			System.out.println("After");
		else if (d == 18) 
			System.out.println("Special");
	}

}
