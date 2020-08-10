package CCC_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = 199;
		int y = 195;
		String t[] = in.readLine().split(" ");

		boolean[][] arr = new boolean[401][200];
		
		arr[199][195] = true;
		arr[199][194] = true;
		arr[199][193] = true;
		arr[200][199] = true;
		arr[200][198] = true;
		arr[200][197] = true;
		arr[200][193] = true;
		arr[201][197] = true;
		arr[201][193] = true;
		arr[202][197] = true;
		arr[202][193] = true;
		arr[206][197] = true;
		arr[206][193] = true;
		arr[203][197] = true;
		arr[203][196] = true;
		arr[203][195] = true;
		arr[203][193] = true;
		arr[204][195] = true;
		arr[204][193] = true;
		arr[205][197] = true;
		arr[205][196] = true;
		arr[205][195] = true;
		arr[205][193] = true;
		arr[207][197] = true;
		arr[207][196] = true;
		arr[207][195] = true;
		arr[207][194] = true;
		arr[207][193] = true;
		
		outer:
		while (!t[0].equals("q")) {
			int m = Integer.parseInt(t[1]);
			if (t[0].equals("l")) {
				while (m != 0) {
					x--;
					m--;
					if (arr[x][y]) {
						System.out.println((x - 200 - m) + " " + (y - 200) + " DANGER");
						break outer;
					}
					arr[x][y] = true;
				}
				System.out.println((x - 200 - m) + " " + (y - 200) + " safe");
			} else if (t[0].equals("r")) {
				while (m != 0) {
					x++;
					m--;
					if (arr[x][y]) {
						System.out.println((x - 200 + m) + " " + (y - 200) + " DANGER");
						break outer;
					}
					arr[x][y] = true;
				}
				System.out.println((x - 200) + " " + (y - 200) + " safe");
			} else if (t[0].equals("u")) {
				while (m != 0) {
					y++;
					m--;
					if (arr[x][y]) {
						System.out.println((x - 200) + " " + (y - 200 + m) + " DANGER");
						break outer;
					}
					arr[x][y] = true;
				}
				System.out.println((x - 200) + " " + (y - 200) + " safe");
			} else if (t[0].equals("d")) {
				while (m != 0) {
					y--;
					m--;
					if (arr[x][y]) {
						System.out.println((x - 200) + " " + (y - 200 - m) + " DANGER");
						break outer;
					}
					arr[x][y] = true;
				}
				System.out.println((x - 200) + " " + (y - 200) + " safe");
			}
			t = in.readLine().split(" ");
		}
	}

}
