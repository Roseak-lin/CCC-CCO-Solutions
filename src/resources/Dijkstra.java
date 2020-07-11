package resources;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
	static boolean visited[];
	static int graph[][];
	static int nodes;
	static PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Compare());

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		nodes = in.nextInt();
		final int edges = in.nextInt();
		visited = new boolean[nodes + 1];
		graph = new int[nodes + 1][nodes + 1];

		for (int i = 0; i < nodes + 1; i++) {
			Arrays.fill(graph[i], Integer.MAX_VALUE);
		}
		for (int i = 0; i < edges; i++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
			graph[a][b] = Math.min(c, graph[a][b]);
			graph[b][a] = Math.min(c, graph[b][a]);
		}

		dijkstra(1);
	}

	static int minDistance(int dist[], int nodes) {
		int min = Integer.MAX_VALUE, min_index = -1;
		for (int v = 1; v <= nodes; v++)
			if (!visited[v] && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}

	static void print(int dist[]) {
		for (int i = 1; i < dist.length; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println(-1);
				continue;
			}
			System.out.println(dist[i]);
		}
	}

	static void dijkstra(int src) {
		int dist[] = new int[nodes + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src] = 0;

		for (int count = 1; count <= nodes; count++) {
			int u = minDistance(dist, count);
			visited[u] = true;
			for (int v = 1; v <= nodes; v++) {
				if (!visited[v] && graph[u][v] != Integer.MAX_VALUE && dist[u] != Integer.MAX_VALUE) {
					dist[v] = Math.min(dist[u] + graph[u][v], dist[v]);
				}
			}
		}
		print(dist);
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
			byte[] buf = new byte[10000]; // line length
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

////////////////////////////////////////////////////////////////////////////////////////

class Compare implements Comparator<int[]> {

	public int compare(int[] o, int[] o1) {
		if (o[1] > o1[1]) {
			return 1;
		} else if (o[1] < o1[1]) {
			return -1;
		} else {
			return 0;
		}
	}

	
}
