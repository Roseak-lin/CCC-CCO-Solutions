import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Wheres_That_Fuel {

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int n = in.nextInt(), s = in.nextInt(), fuel = 0, planets = 1;
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		for (int i = 1; i <= n; i++) {
			if (i == s) {
				fuel = in.nextInt();
				in.nextInt();
				continue;
			}
			q.add(new int[] { in.nextInt(), in.nextInt() });
		}
//		for (int i[] : q) {
//			System.out.println(i[0] + " " + i[1]);
//		}
		while (!q.isEmpty()) {
			if (q.peek()[1] > q.peek()[0] || fuel - q.peek()[1] < 0) {
				q.poll();
				continue;
			}
			fuel -= q.peek()[1];
			fuel += q.peek()[0];
			planets++;
			q.poll();
		}
		System.out.println(fuel + "\n" + planets);
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