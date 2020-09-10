import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S4 {
	static ArrayList<edge> arr[] = new ArrayList[2002];
	static PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {
			return o1[2] - o2[2];
		}
	});
	static int dist[] = new int[2002];

	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		int k = in.nextInt(), n = in.nextInt(), m = in.nextInt();
		for (int i = 1; i <= 2001; i++) {
			arr[i] = new ArrayList<edge>();
			dist[i] = Integer.MAX_VALUE;
		}

		while (m-- != 0) {
			int a = in.nextInt(), b = in.nextInt(), t = in.nextInt(), h = in.nextInt();
			arr[a].add(new edge(b, t, h));
			arr[b].add(new edge(a, t, h));
		}
		int f = in.nextInt(), t = in.nextInt();
		q.add(new int[] { f, 0, 0 });
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			dist[curr[0]] = Math.min(dist[curr[0]], curr[1]);
			for (edge e : arr[curr[0]]) {
				if (curr[2] >= k || e.h + curr[2] >= k || e.d + curr[1] > dist[e.t]) {
					continue;
				}
				q.add(new int[] {e.t, e.d + curr[1], e.h + curr[2]});
			}
		}
		System.out.println(dist[t] == Integer.MAX_VALUE ? -1 : dist[t]);
	}

	static class Reader {
		final private int BUFFER_SIZE = 100000;
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
			byte[] buf = new byte[BUFFER_SIZE];
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
 class edge {
		int t, d, h;

		edge(int t, int d, int h) {
			this.t = t;
			this.d = d;
			this.h = h;
		}
	}