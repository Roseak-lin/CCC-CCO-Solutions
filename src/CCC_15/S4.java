package CCC_15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S4 {
	static int dist[] = new int[201], damage[] = new int[201], from[] = new int[201];
	static ArrayList<int[]> paths[] = new ArrayList[201];

	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		int k = in.nextInt(), n = in.nextInt(), m = in.nextInt();
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return 1;
			}
		});
		for (int i = 0; i < n; i++) {
			paths[i] = new ArrayList<int[]>();
		}
		// edge weight, damage to hull
		for (int i = 0; i < m; i++) {
			int f = in.nextInt(), t = in.nextInt(), time = in.nextInt(), cost = in.nextInt();
			paths[f].add(new int[] {t, time, cost});
			paths[t].add(new int[] {f, time, cost});
		}
		int from = in.nextInt(), to = in.nextInt();
		boolean visited[] = new boolean[n + 1];
		dist[from] = 0;
		damage[from] = 0;
		for (int i = 1; i <= n; i++) {

		}
		while (!q.isEmpty()) {
			int p[] = q.poll();
			if (visited[p[0]]) {
				continue;
			}
			visited[p[0]] = true;
			if (p[1] < dist[p[0]]) {
				
			}
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
