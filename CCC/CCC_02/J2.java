package CCC_02;

import java.util.ArrayList;
import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String w = in.nextLine();
		ArrayList<String> arr = new ArrayList();

		while (!w.equals("quit!")) {
			char[] temp = w.toCharArray();

			if (w.length() > 4) {
				if ((temp[temp.length - 1]) == 'r' && temp[temp.length - 2] == 'o'
						&& (temp[temp.length - 3] != 'a' && temp[temp.length - 3] != 'e' && temp[temp.length - 3] != 'i'
								&& temp[temp.length - 3] != 'o' && temp[temp.length - 3] != 'u'
								&& temp[temp.length - 3] != 'y')) {
					temp[temp.length - 1] = 'u';
					temp[temp.length - 2] = 'o';
					w = String.valueOf(temp);
					w += "r";
					arr.add(w);
				} else {
					arr.add(w);
				}
			} else {
				arr.add(w);
			}
			w = in.nextLine();
		}
		for (String i : arr) {
			System.out.println(i);
		}
	}

}
