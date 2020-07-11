package CCC_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String l = in.readLine();
		while (!l.equals("0")) {
			String temp[] = l.split(" ");
			String op[] = new String[temp.length];
			int opCount = 0;
			boolean write = false;

			for (int i = 0; i < op.length; i++) {
				op[i] = "n";
			}
			for (int i = 0; i < temp.length; i++) {
				if (temp[i].equals("+") || temp[i].equals("-")) {
					op[i] = temp[i];
					temp[i] = "n";
					opCount++;
				}
			}
			if (opCount == 1) {
				for (int i = 0; i < temp.length; i++) {
					if (temp[i].equals("n"))
						continue;
					System.out.print(temp[i] + " ");
				}
				for (int i = 0; i < op.length; i++) {
					if (op[i].equals("n"))
						continue;
					else {
						System.out.print(op[i] + ' ');
					}
				}
			} else {
				for (int i = 0; i < temp.length; i++) {
					
				}

			}

			}
			System.out.println("");
			l = in.readLine();
		

	}

}
