import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class S5 {
	static ArrayList<int[]> arr[] = new ArrayList[10001];
	static boolean visited[] = new boolean[100001];
	
	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		ArrayList<Integer> req = new ArrayList<Integer>();
		int n = in.nextInt(), e = in.nextInt(), d = in.nextInt();
		int min[] = new int[n + 1];
		Arrays.fill(min, -1);
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<int[]>();
		}
		for (int i = 0; i < e; i++) {
			int f = in.nextInt(), t = in.nextInt(), w = in.nextInt();
			arr[f].add(new int[] { t, w });
			arr[t].add(new int[] { f, w });
		}
		
		while (d-- != 0)
			req.add(in.nextInt());

		
		for (int i = 1; i <= n; i++) {
			for (int j[] : arr[i]) {
				min[i] = Math.max(min[i], j[1]);
			}
		}
		
		int max = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			if (req.contains(i)) {
				max = Math.min(min[i], max);
			}
		}
		System.out.println(max);
		

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