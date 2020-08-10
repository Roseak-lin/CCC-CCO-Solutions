package CCC_02;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class S3 {
	static int x, y;
	static char arr[][];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream in = new DataInputStream(System.in);
		y = Integer.parseInt(in.readLine());
		x = Integer.parseInt(in.readLine());
		arr = new char[y][x];

		for (int i = 0; i < y; i++) {
			arr[i] = in.readLine().toCharArray();
		}
		int c = Integer.parseInt(in.readLine());
		LinkedList<Character> q = new LinkedList<Character>();
		for (int i = 0; i < c; i++) {
			q.add(in.readLine().charAt(0));
		}
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (arr[i][j] == 'X') {
					continue;
				}
				dfs(j, i, (LinkedList<Character>) q.clone(), 'r');
				dfs(j, i, (LinkedList<Character>) q.clone(), 'l');
				dfs(j, i, (LinkedList<Character>) q.clone(), 'u');
				dfs(j, i, (LinkedList<Character>) q.clone(), 'd');
//				System.out.println();
			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	static void dfs(int cx, int cy, LinkedList<Character> q, char d) {
//		System.out.println(q + " " + cx + " " + cy + " " + d);
		if (cy >= y || cx >= x || cx < 0 || cy < 0 || arr[cy][cx] == 'X') {
			return;
		}
		if (q.isEmpty()) {
			arr[cy][cx] = '*';
			return;
		}
		char c = q.poll();
		if (c == 'F') {
			switch (d) {
			case 'u':
				dfs(cx, cy - 1, q, 'u');
				break;
			case 'd':
				dfs(cx, cy + 1, q, 'd');
				break;
			case 'l':
				dfs(cx - 1, cy, q, 'l');
				break;
			case 'r':
				dfs(cx + 1, cy, q, 'r');
				break;
			default:
				break;
			}
		} else if (c == 'L') {
			switch (d) {
			case 'u':
				dfs(cx, cy, q, 'l');
				break;
			case 'd':
				dfs(cx, cy, q, 'r');
				break;
			case 'l':
				dfs(cx, cy, q, 'd');
				break;
			case 'r':
				dfs(cx, cy, q, 'u');
				break;
			default:
				break;
			}
		} else {
			switch (d) {
			case 'u':
				dfs(cx, cy, q, 'r');
				break;
			case 'd':
				dfs(cx, cy, q, 'l');
				break;
			case 'l':
				dfs(cx, cy, q, 'u');
				break;
			case 'r':
				dfs(cx, cy, q, 'd');
				break;
			default:
				break;
			}
		}
	}

}