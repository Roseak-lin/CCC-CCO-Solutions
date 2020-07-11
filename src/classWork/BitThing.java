package classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class BitThing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Character> op = new ArrayList<Character>();
		
		while (true) {
			nums.add(in.nextInt());
			String next = in.next();
			op.add(next.charAt(0));
			if (next.equals("END")) {
				break;
			}
		}
		
	}

}