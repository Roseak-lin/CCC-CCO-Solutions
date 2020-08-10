package CCC_14;

import java.io.IOException;
import java.util.Scanner;

public class S2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		boolean good = true;
		String p1[] = new String[g];
		String p2[] = new String[g];
		for (int i = 0; i < g; i++) {
			p1[i] = in.next();
		}
		for (int i = 0; i < g; i++) {
			p2[i] = in.next();
		}
		outer:
		for (int i = 0; i < g; i++) {
			for (int j = 0; j < g; j++) {
				if (p1[i].equals(p2[j]) && i != j && p1[j].equals(p2[i])) {
					continue outer;
				}
			}
			good = false;
			System.out.println("bad");
			break outer;
		}
		if (good) {
			System.out.println("good");
		}
		
	}
}