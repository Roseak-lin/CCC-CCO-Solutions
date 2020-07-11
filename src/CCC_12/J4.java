package CCC_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		String[] l = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String word[] = in.readLine().split("");
		String newWord[] = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			int place;
			for (int j = 0; j < 26; j++) {
				if (word[i].equals(l[j])) {
					int shift = 3 * (i + 1) + m;
					place = j;
					
					if (place - shift < 0) {
						int temp = shift - place - 1;
						newWord[i] = l[25 - temp];
						break;
					} else {
						newWord[i] = l[place - shift];
						break;
					}
				}
			}
		}
	
		for (String i: newWord) {
			System.out.print(i);
		}
	}
}
