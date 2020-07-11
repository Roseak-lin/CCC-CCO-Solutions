package CCC_16;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S3 {

	static ArrayList<Integer> arr[] = new ArrayList[100001];
	static int r, p;
	static ArrayList<Integer> pho = new ArrayList<Integer>();
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		r = Integer.parseInt(s.nextToken());
		p = Integer.parseInt(s.nextToken());
		s = new StringTokenizer(in.readLine());
		pho = new ArrayList<Integer>();
		while (s.hasMoreTokens()) {
			pho.add(Integer.parseInt(s.nextToken()));
		}

		for (int i = 0; i < r - 1; i++) {
			arr[i] = new ArrayList();
		}
		for (int i = 0; i < r - 1; i++) {
			s = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(s.nextToken()), b = Integer.parseInt(s.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		for (int i = 0; i < r; i++) {
			if (arr[i].size() == 1 && !pho.contains(i)) {
				arr[arr[i].get(0)].remove(arr[arr[i].get(0)].indexOf(i));
				arr[i].clear();
			}
		}
		for (int i : pho) {
			Queue<Integer> q = new LinkedList();
			for (int j : arr[i]) {
				q.add(i);
			}
			boolean visited[] = new boolean[r];
			while (!q.isEmpty()) {

			}
		}
		System.out.println(min);
	}
}

class pair {
	int x, d;

	pair(int x, int d) {
		this.x = x;
		this.d = d;
	}
}