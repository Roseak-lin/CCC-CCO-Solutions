package other;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Grid_2 {
	static long dp[][];
	static ArrayList<Integer> filled[] = new ArrayList[100001];
	static long mod = 1000000007;

	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		int m = in.nextInt(), n = in.nextInt(), s = in.nextInt();
		dp = new long[2][n + 1];
		for (int i = 0; i < s; i++) {
			int y = in.nextInt(), x = in.nextInt();
			if (filled[y] == null) {
				filled[y] = new ArrayList<Integer>();
				filled[y].add(x);
			} else {
				filled[y].add(x);
			}
		}
		dp[0][0] = 1;
		if (filled[1] != null) {
			for (int i = 1; i <= n; i++) {
				if (filled[1].contains(i)) {
					dp[0][i] = 0;
				} else {
					dp[0][i] = dp[0][i - 1];
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				dp[0][i] = 1;
			}
		}
		if (filled[2] != null) {
			for (int i = 1; i <= n; i++) {
				if (filled[2].contains(i)) {
					dp[1][i] = 0;
				} else {
					dp[1][i] = (dp[0][i] + dp[1][i - 1]) % mod;
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				dp[1][i] = (dp[0][i] + dp[1][i - 1]) % mod;
			}
		}
		
		
		for (int i = 3; i <= m; i++) {
			dp[0] = dp[1];
			for (int j = 1; j <= n; j++) {
				if ((filled[i] != null) && filled[i].contains(j)) {
					dp[1][j] = 0;
				} else {
					dp[1][j] = (dp[1][j - 1] + dp[0][j]) % mod;
				}
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((filled[i] != null) && filled[i].contains(j) ? "#" : ".");
			}
			System.out.println();
		}
		System.out.println(dp[1][n]);
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
