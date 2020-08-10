package CCC_14;

import java.util.Scanner;

public class CCC2014j2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int votes = in.nextInt();
		String vote = in.nextLine();
		vote = in.nextLine();
		int a = 0; 
		int b = 0;
		
		for (int i = 0; i < votes; i++) {
			if (vote.charAt(i) == 'A') 
				a++;
			else
				b++;
		}
		
		if (a > b) 
			System.out.println("A");
		else if (a < b)
			System.out.println("B");
		else 
			System.out.println("Tie");
	}

}
