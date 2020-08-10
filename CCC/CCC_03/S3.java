import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S3 {
	static int sizes[] = new int[625];
	static int maxX, maxY;
	static int s = 0;

	public static void main(String[] args) {
		FastReader in = new FastReader();
		int flooring = in.nextInt();
		maxY = in.nextInt();
		maxX = in.nextInt();
		int arr[][] = new int[maxY][maxX];
		int rooms = 2;
		int poss = 0;
		for (int i = 0; i < maxY; i++) {
			char[] line = in.nextLine().toCharArray();
			for (int j = 0; j < maxX; j++) {
				if (line[j] == 'I') {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
				if (arr[i][j] == 0) {
					s = 0;
					flood(arr, rooms, j, i);
					rooms++;
				}
			}
		}
//		for (int i = 0; i < maxY; i++) {
//			for (int j = 0; j < maxX; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		Arrays.sort(sizes);
		for (int i = sizes.length - 1; i >= 0; i--) {
			if (sizes[i] == 0) {
				break;
			}
			if (flooring - sizes[i] < 0) {
				break;
			}
			poss++;
			flooring -= sizes[i];
		}

		if (poss == 1)
			System.out.println(poss + " room, " + flooring + " square metre(s) left over");
		else
			System.out.println(poss + " rooms, " + flooring + " square metre(s) left over");
	}

	static void flood(int arr[][], int room, int x, int y) {
		if (x >= maxX || y >= maxY || x < 0 || y < 0 || arr[y][x] == room || arr[y][x] == 1) {
			sizes[room] = s;
			return;
		}
		s++;
		arr[y][x] = room;
		flood(arr, room, x + 1, y);
		flood(arr, room, x - 1, y);
		flood(arr, room, x, y + 1);
		flood(arr, room, x, y - 1);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}