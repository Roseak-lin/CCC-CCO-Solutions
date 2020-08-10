import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Vampire_Tunnels {
	static int dist[] = new int[1601];
	static ArrayList<edge> arr[] = new ArrayList[1601];

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int max = in.nextInt();
		int n = in.nextInt(), e = in.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = new ArrayList<edge>();
			dist[i] = 0x3f3f3f3f;
		}
		while (e-- != 0) {
			int f = in.nextInt(), t = in.nextInt(), d = in.nextInt(), u = in.nextInt();
			if (u == 0) {
				arr[f].add(new edge(t, d, false));
				arr[t].add(new edge(f, d, false));
			} else {
				arr[f].add(new edge(t, d, true));
				arr[t].add(new edge(f, d, true));

			}
		}
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] p1, int[] p2) {
				return p1[2] - p2[2];
			}
		});
		q.add(new int[] { 0, 0, 0 });
		while (!q.isEmpty()) {
			int curr[] = q.poll();
			dist[curr[0]] = Math.min(dist[curr[0]], curr[1]);
			for (edge x : arr[curr[0]]) {
				if ((x.above && x.d + curr[2] > max) || dist[x.t] <= curr[1] + x.d || curr[2] > max) {
					continue;
				}
				if (x.above) {
					q.add(new int[] { x.t, x.d + curr[1], x.d + curr[2] });
				} else {
					q.add(new int[] { x.t, x.d + curr[1], curr[2] });
				}

			}
		}
		System.out.println(dist[n - 1] == 0x3f3f3f3f ? -1 : dist[n - 1]);
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

		String readLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {

			}
			return str;
		}
	}
}

class edge {
	int t, d;
	boolean above;

	edge(int t, int d, boolean above) {
		this.t = t;
		this.d = d;
		this.above = above;
	}
}