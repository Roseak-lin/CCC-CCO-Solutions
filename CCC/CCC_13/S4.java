package CCC_13;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S4 {
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		final int n = Integer.parseInt(s.nextToken());
		final int m = Integer.parseInt(s.nextToken());
		arr = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			s = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(s.nextToken());
			int y = Integer.parseInt(s.nextToken());
			arr[x].add(y);
		}

		s = new StringTokenizer(in.readLine());
		final int x = Integer.parseInt(s.nextToken());
		final int y = Integer.parseInt(s.nextToken());

//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i] + " " + i);
//		}
		if (bfs(n, x, y)) {
			System.out.println("yes");
		} else if (bfs(n, y, x)) {
			System.out.println("no");
		} else {
			System.out.println("unknown");
		}
	}

	static boolean bfs(int n, int start, int des) {
		boolean visited[] = new boolean[n + 1];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		while (!queue.isEmpty()) {
			int temp = queue.removeFirst();
			for (int i = 0; i < arr[temp].size(); i++) {
				if (!visited[arr[temp].get(i)]) {
					queue.add(arr[temp].get(i));
					visited[arr[temp].get(i)] = true;
				}
			}
			if (visited[des]) {
				return true;
			}
		}
		return false;
	}
}
