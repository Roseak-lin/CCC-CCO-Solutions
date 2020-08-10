package CCC_15;

import java.util.ArrayList;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		char[] arr = in.toLowerCase().toCharArray();
		ArrayList<Character> a = new ArrayList<Character>();
		String c = "abcdefghijklmnopqrstuvwxyz";
		String nextVowel = "aaaeeeiiiiiioooooouuuuuuuuu";
		String nextChar = "bcdffghjjklmnppqrstvvwxyzz";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != c.charAt(count)) {
				count++;
			}
			if (count == 0 || count == 4 || count == 8 || count == 14 || count == 20)
				a.add(c.charAt(count));
			else {
				a.add(c.charAt(count));
				a.add(nextVowel.charAt(count));
				a.add(nextChar.charAt(count));
			}
			count = 0;
		}
		for (char i : a) {
			System.out.print(i);
		}
	}

}
