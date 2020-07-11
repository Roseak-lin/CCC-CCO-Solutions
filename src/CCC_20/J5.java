package CCC_20;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;

public class Actual_J5 {

	public static void main(String[] args) throws Exception {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		ArrayDeque<Integer> moves = new ArrayDeque<Integer>();
		boolean visited[][];
		HashMap<Integer, ArrayDeque<Integer>> map = new HashMap<Integer, ArrayDeque<Integer>>();
		Reader in = new Reader();
		final int y = in.nextInt();
		final int x = in.nextInt();
		int arr[][] = new int[x + 1][y + 1];
		visited = new boolean[x + 1][y + 1];
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				arr[j][i] = in.nextInt();
				if (arr[j][i] > x * y && i != y && j != x) {
					visited[j][i] = true;
				}
			}
		}
		in.close();
		queue.addLast(1);
		queue.addLast(1);
		visited[1][1] = true;
		while (visited[x][y] == false && !queue.isEmpty()) {
			int s = queue.removeFirst();
			int s1 = queue.removeFirst();
			if (arr[s][s1] == x * y) {
				visited[x][y] = true;
				break;
			}
			factors(arr[s][s1], x, y, map, moves);
			while (!moves.isEmpty()) {
				int n1 = moves.removeFirst();
				int n2 = moves.removeFirst();
				if (visited[n1][n2]) {
					continue;
				}
				move(n1, n2, visited, queue);
			}
		}

		if (queue.isEmpty() && !visited[x][y]) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}
	}

	static void move(int x, int y, boolean visited[][], LinkedList<Integer> queue) {
		visited[x][y] = true;
		queue.addLast(x);
		queue.addLast(y);
	}

	static void factors(int n, int x, int y, HashMap<Integer, ArrayDeque<Integer>> map, ArrayDeque<Integer> moves) {
		if (map.containsKey(n)) {
			for (int i : map.get(n)) {
				moves.add(i);
			}
		} else {
			for (int i = 1; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					int n1 = i;
					int n2 = n / i;
					if (n1 <= x && n2 <= x && n1 <= y && n2 <= y) {
						moves.add(n1);
						moves.add(n2);
						moves.add(n2);
						moves.add(n1);
					} else if (n1 <= x && n1 >= y && n2 <= y) {
						moves.add(n1);
						moves.add(n2);
					} else if (n1 >= x && n1 <= y && n2 <= x) {
						moves.add(n2);
						moves.add(n1);
					} else if (n2 <= x && n2 >= y && n1 <= y) {
						moves.add(n2);
						moves.add(n1);
					} else if (n2 <= y && n2 >= x && n1 <= x) {
						moves.add(n1);
						moves.add(n2);
					}
				}
			}
			map.put(n, moves);
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
			byte[] buf = new byte[64]; // line length
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