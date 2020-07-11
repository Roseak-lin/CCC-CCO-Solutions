package CCC_16;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int largest = 0;
		String word = in.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				String reverse = "";
				for (int x = j; x >= i; x--) {
					reverse += word.charAt(x);
				}
				System.out.println(word.substring(i, j + 1) + " " + reverse);
				if (word.substring(i, j + 1).equals(reverse)) {
					if (j - i > largest) {
						largest = j - i + 1;
					}
				}
			}
		}
		System.out.println(largest);
	}

}
