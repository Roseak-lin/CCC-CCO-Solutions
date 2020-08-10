package CCC_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S3 {
	static char grid[][];
	static int x, y;
	static int sX, sY;
	static int dist[][];
	static boolean flag = false;

	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader();
		y = in.nextInt();
		x = in.nextInt();
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		LinkedList<Integer> cam = new LinkedList<Integer>();
		grid = new char[y][x];
		dist = new int[y][x];
		for (int i = 0; i < y; i++) {
			Arrays.fill(dist[i], 100001);
		}
		for (int i = 0; i < y; i++) {
			char temp[] = in.readLine().toCharArray();
			for (int j = 0; j < x; j++) {
				grid[i][j] = temp[j];
				if (grid[i][j] == 'S') {
					sX = j;
					sY = i;
				}
				if (grid[i][j] == 'C') {
					cam.add(j);
					cam.add(i);
				}
				if (grid[i][j] == '.') {
					list.add(i);
					list.add(j);
				}
			}
		}
		while (!cam.isEmpty() && !flag) {
			int x = cam.poll();
			int y = cam.poll();
			camarabfs(x, y);
		}
		if (!flag) {
			bfs();
		}
		while (!list.isEmpty()) {
			int x = list.poll();
			int y = list.poll();
			if (grid[x][y] == 'W' || flag) {
				System.out.println(-1);
				continue;
			}
			System.out.println(dist[x][y] == 100001 ? -1 : dist[x][y]);
		}
//		for (int i = 0; i < y; i++) {
//			for (int j = 0; j < x; j++) {
//				System.out.print(grid[i][j]);
//			}
//			System.out.println();
//		}
	}

	static void bfs() {
		boolean visited[][] = new boolean[y][x];
		LinkedList<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { sX + 1, sY, 1 });
		q.add(new int[] { sX - 1, sY, 1 });
		q.add(new int[] { sX, sY - 1, 1 });
		q.add(new int[] { sX, sY + 1, 1 });
		visited[sY][sX] = true;
		dist[sY][sX] = 0;
		while (!q.isEmpty()) {
			int arr[] = q.poll();
			if (visited[arr[1]][arr[0]] || grid[arr[1]][arr[0]] == 'W' ||grid[arr[1]][arr[0]] == '*') {
				continue;
			} else {
				visited[arr[1]][arr[0]] = true;
				dist[arr[1]][arr[0]] = Math.min(dist[arr[1]][arr[0]], arr[2]);
				if (grid[arr[1]][arr[0]] == 'L') {
					q.addFirst(new int[] { arr[0] - 1, arr[1], arr[2] });
				} else if (grid[arr[1]][arr[0]] == 'R') {
					q.addFirst(new int[] { arr[0] + 1, arr[1], arr[2] });
				} else if (grid[arr[1]][arr[0]] == 'U') {
					q.addFirst(new int[] { arr[0], arr[1] - 1, arr[2] });
				} else if (grid[arr[1]][arr[0]] == 'D') {
					q.addFirst(new int[] { arr[0], arr[1] + 1, arr[2] });
				} else {
					q.add(new int[] { arr[0] + 1, arr[1], arr[2] + 1 });
					q.add(new int[] { arr[0] - 1, arr[1], arr[2] + 1 });
					q.add(new int[] { arr[0], arr[1] - 1, arr[2] + 1 });
					q.add(new int[] { arr[0], arr[1] + 1, arr[2] + 1 });
				}
			}
		}
	}

	static void camarabfs(int cx, int cy) {
		for (int i = cx; i < x; i++) {
			if (grid[cy][i] == 'W') {
				break;
			}
			if (grid[cy][i] == '.') {
				grid[cy][i] = '*';
			}
			if (grid[cy][i] == 'S') {
				flag = true;
				return;
			}
		}
		for (int i = cx; i > -1; i--) {
			if (grid[cy][i] == 'W') {
				break;
			}
			if (grid[cy][i] == '.') {
				grid[cy][i] = '*';
			}
			if (grid[cy][i] == 'S') {
				flag = true;
				return;
			}
		}
		for (int i = cy; i < y; i++) {
			if (grid[i][cx] == 'W') {
				break;
			}
			if (grid[i][cx] == '.') {
				grid[i][cx] = '*';
			}
			if (grid[i][cx] == 'S') {
				flag = true;
				return;
			}
		}
		for (int i = cy; i > -1; i--) {
			if (grid[i][cx] == 'W') {
				break;
			}
			if (grid[i][cx] == '.') {
				grid[i][cx] = '*';
			}
			if (grid[i][cx] == 'S') {
				flag = true;
				return;
			}
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
					st = new StringTokenizer(br.readLine().trim());
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

		String readLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		void close() throws IOException {
			br.close();
		}
	}
}