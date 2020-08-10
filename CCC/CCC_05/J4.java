import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J4 {
	static boolean arr[][];
	static int l, w;

	static void solve(int d, int x, int y, int steps) {
		if (steps == 0 || (y - 1 >= 0 && y + 1 < w && x - 1 >= 0 && x + 1 < l && arr[y - 1][x] && arr[y][x - 1]
				&& arr[y + 1][x] && arr[y][x + 1])) {
			System.out.println((x + 1) + "\n" + (y + 1));
			return;
		}
		arr[y][x] = true;
		// up
		if (d == 0) {
			if (y - 1 < 0 || arr[y - 1][x]) {
				solve(1, x + 1, y, steps - 1);
			} else if (x - 1 < 0 || arr[y][x - 1]) {
				solve(0, x, y - 1, steps - 1);
			} else if (!arr[y][x - 1]) {
				solve(3, x - 1, y, steps - 1);
			}
			// right
		} else if (d == 1) {
			if (x + 1 >= l || arr[y][x + 1]) {
				solve(2, x, y + 1, steps - 1);
			} else if (y - 1 < 0 || arr[y - 1][x]) {
				solve(1, x + 1, y, steps - 1);
			} else if (!arr[y - 1][x]) {
				solve(0, x, y - 1, steps - 1);
			}
			// down
		} else if (d == 2) {
			if (y + 1 >= w || arr[y + 1][x]) {
				solve(3, x - 1, y, steps - 1);
			} else if (x + 1 >= l || arr[y][x + 1]) {
				solve(2, x, y + 1, steps - 1);
			} else if (!arr[y][x + 1]) {
				solve(1, x + 1, y, steps - 1);
			}
			// left
		} else {
			if (x - 1 < 0 || arr[y][x - 1]) {
				solve(0, x, y - 1, steps - 1);
			} else if (y + 1 >= w || arr[y + 1][x]) {
				solve(3, x - 1, y, steps - 1);
			} else if (!arr[y][x - 1]) {
				solve(2, x, y + 1, steps - 1);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		l = in.nextInt();
		w = in.nextInt();
		int cl = in.nextInt(), cw = in.nextInt(), steps = in.nextInt();
		arr = new boolean[w][l];
		for (int i = 1; i <= cw; i++) {
			for (int j = 1; j <= cl; j++) {
				arr[i - 1][j - 1] = true;
				arr[w - i][l - j] = true;
				arr[w - i][j - 1] = true;
				arr[i - 1][l - j] = true;
			}
		}
		for (int i = 0; i < l; i++) {
			if (!arr[0][i]) {
				solve(1, i, 0, steps);
				break;
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