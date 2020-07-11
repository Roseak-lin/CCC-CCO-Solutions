package CCC_03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class S5 {
	static ArrayList<int[]> arr[] = new ArrayList[10001];
	static boolean visited[] = new boolean[100001];

	public static void main(String[] args) throws IOException {
		Reader in = new Reader();
		int n = in.nextInt(), e = in.nextInt(), d = in.nextInt();
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<int[]>();
		}
		for (int i = 0; i < e; i++) {
			int f = in.nextInt(), t = in.nextInt(), w = in.nextInt();
			arr[f].add(new int[] { t, w });
			arr[t].add(new int[] { f, w });
		}
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return (o1[2] - o2[2]) * -1;
			}
		});

		for (int i[] : arr[1]) {
			q.add(new int[] { 1, i[0], i[1] });
		}

		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < d; i++) {
			temp.add(in.nextInt());
		}
		while (!q.isEmpty() && d != 0) {
			int t[] = q.poll();
//			System.out.println(t[0] + " " + t[1] + " " + t[2]);
			if (visited[t[0]]) {
				continue;
			}
//			System.out.println(t[0] + " " + t[1] + " " + t[2]);
			if (temp.contains(t[0])) {
				d--;
			}
			visited[t[0]] = true;
			arr[t[0]].clear();
			arr[t[0]].add(new int[] { t[1], t[2] });
			for (int i[] : arr[t[1]]) {
				if (!visited[i[0]]) {
					q.add(new int[] { t[1], i[0], i[1] });
				}
			}
		}
//		for (int i = 1; i <= n; i++) {
//			System.out.println(arr[i].get(0)[0] + " " + arr[i].get(0)[1]);
//		}
		int min = Integer.MAX_VALUE;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean v2[] = new boolean[10001];
		queue.add(1);
		while (!queue.isEmpty()) {
			int num = queue.poll();
			if (v2[arr[num].get(0)[0]]) {
				break;
			}
			v2[num] = true;
			min = Math.min(min, arr[num].get(0)[1]);
			queue.add(arr[num].get(0)[0]);
		}
		System.out.println(min);

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
