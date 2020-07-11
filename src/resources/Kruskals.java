package resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Kruskals {

	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		int nodes = in.nextInt(), edges = in.nextInt();
		int graph[][] = new int[nodes + 1][nodes + 1];
		boolean visited[] = new boolean[nodes + 1];
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		for (int i = 0; i < edges; i++) {
			int from = in.nextInt(), to = in.nextInt(), weight = in.nextInt();
			// 0 < from, to <= nodes; no duplicate edges
			q.add(new int[] { from, to, weight });
		}
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			System.out.println(temp[0] + " " + temp[1] + " " + temp[2]);
			if (visited[temp[0]] && visited[temp[1]]) {
				continue;
			} else {
				visited[temp[0]] = true;
				visited[temp[1]] = true;
				graph[temp[0]][temp[1]] = temp[2];
			}
		}
		for (int i = 0; i <= nodes; i++) {
			for (int j = 0; j <= nodes; j++) {
				if (graph[i][j] != 0) {
					System.out.println(i + " to " + j + " = " + graph[i][j]);
				}
			}
		}
	}

	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
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
	}

}
