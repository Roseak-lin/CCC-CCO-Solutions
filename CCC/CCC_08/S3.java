package CCC_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S3 {

	public static void main(String[] args) {
		FastReader in = new FastReader();
		int tests = in.nextInt();

		outer: for (int i = 0; i < tests; i++) {
			LinkedList<int[]> queue = new LinkedList<int[]>();
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int currX = 0, currY = 0;
			char arr[][] = new char[n1][n2];
			boolean visited[][] = new boolean[n1][n2];
			for (int j = 0; j < n1; j++) {
				char[] c = in.nextLine().toCharArray();
				for (int x = 0; x < n2; x++) {
					arr[j][x] = c[x];
				}
			}
			queue.add(new int[] { 0, 0, 1 });
			while (!queue.isEmpty()) {
				int curr[] = queue.pop();
				int x = curr[0];
				int y = curr[1];
				if (x < 0 || x >= n2 || y < 0 || y >= n1 || visited[y][x] || arr[y][x] == '*') {
					continue;
				}
				visited[y][x] = true;
				if (y == n1 - 1 && x == n2 - 1) {
					System.out.println(curr[2]);
					continue outer;
				}
				
				if (arr[y][x] == '+') {
					queue.add(new int[] { x + 1, y, curr[2] + 1 });
					queue.add(new int[] { x - 1, y, curr[2] + 1 });
					queue.add(new int[] { x, y + 1, curr[2] + 1 });
					queue.add(new int[] { x, y - 1, curr[2] + 1 });
				} else if (arr[y][x] == '-') {
					queue.add(new int[] { x + 1, y, curr[2] + 1 });
					queue.add(new int[] { x - 1, y, curr[2] + 1 });
				} else if (arr[y][x] == '|') {
					queue.add(new int[] { x, y + 1, curr[2] + 1 });
					queue.add(new int[] { x, y - 1, curr[2] + 1 });
				}
			}
			System.out.println(-1);
		}
		
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