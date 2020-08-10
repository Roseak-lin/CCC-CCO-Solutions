package resources;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra_PQ {
	static boolean visited[];
	static int graph[][];
	static int nodes;
	static int dist[], from[];
	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		nodes = in.nextInt();
		final int edges = in.nextInt();
		visited = new boolean[nodes + 1];
		dist = new int[nodes + 1];
		from = new int[nodes + 1];
		graph = new int[nodes + 1][nodes + 1];

		for (int i = 0; i < nodes + 1; i++) {
			Arrays.fill(graph[i], Integer.MAX_VALUE);
		}
		for (int i = 0; i < edges; i++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
			graph[a][b] = Math.min(c, graph[a][b]);
			graph[b][a] = Math.min(c, graph[b][a]);
		}
		Arrays.fill(dist, 0x3f3f3f3f);
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] > o2[1]) {
					return 1;
				} else if (o1[1] < o2[1]) {
					return -1;
				}
				return 0;
			}
		});

		// starting from node 1
		// queue's elements: current node, weight, from
		for (int i = 0; i < nodes + 1; i++) {
			if (graph[1][i] != Integer.MAX_VALUE) {
				q.add(new int[] { i, graph[1][i], 1 });
			}
		}
		visited[1] = true;
		dist[1] = 0;
		while (!q.isEmpty()) {
			int arr[] = q.poll();
			if (visited[arr[0]]) {
				continue;
			}
			visited[arr[0]] = true;
			if (dist[arr[0]] > arr[1] + dist[arr[2]]) {
				dist[arr[0]] = arr[1];
				from[arr[0]] = arr[2];
			}

			for (int i = 0; i < graph[arr[0]].length; i++) {
				if (graph[arr[0]][i] != Integer.MAX_VALUE) {
					q.add(new int[] { i, graph[arr[0]][i] + arr[1], arr[0] });
				}
			}
		}
		for (int i = 1; i <= nodes; i++) {
			System.out.println(dist[i] == 0x3f3f3f3f ? "-1" : dist[i]);
		}
	}
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[100000];
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

}
