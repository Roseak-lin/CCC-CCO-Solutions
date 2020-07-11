package CCC_20;

import java.io.*;
import java.util.*;

public class J4 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word2 = in.next().toString();
		String word1[] = in.next().split("");
		
		List arr = Arrays.asList(word1);
		if (word2.contains(arr.toString())) {
			System.out.println("yes");
			System.exit(0);
		}
		for (int i = 0; i < arr.size(); i++) {
			Collections.rotate(arr, 1);
			System.out.println(word2 + " " + arr.toString());
			if (word2.contains(arr.toString())) {
				System.out.println("yes");
				System.exit(0);
			}
		}
		System.out.println("no");
	}

}
