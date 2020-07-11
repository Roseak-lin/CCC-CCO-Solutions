package CCC_09;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class J5 {
	static ArrayList<Integer> arr[] = new ArrayList[51];

	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		for (int i = 1; i < 51; i++) {
			if (i == 1) {
				Integer a[] = { 6 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 2) {
				Integer a[] = { 6 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 3) {
				Integer a[] = { 6, 4, 5, 15 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 4) {
				Integer a[] = { 6, 5, 3 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 5) {
				Integer a[] = { 6, 3, 4 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 6) {
				Integer a[] = { 1, 2, 7, 3, 4, 5 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 7) {
				Integer a[] = { 6, 8 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 8) {
				Integer a[] = { 7, 9 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 9) {
				Integer a[] = { 8, 10, 12 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 10) {
				Integer a[] = { 9, 11 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 11) {
				Integer a[] = { 12, 10 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 12) {
				Integer a[] = { 9, 11, 13 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 13) {
				Integer a[] = { 15, 12, 14 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 14) {
				Integer a[] = { 13 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 15) {
				Integer a[] = { 3, 13 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 16) {
				Integer a[] = { 18, 17 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 17) {
				Integer a[] = { 16, 18 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else if (i == 18) {
				Integer a[] = { 17, 16 };
				arr[i] = new ArrayList<Integer>(Arrays.asList(a));
			} else {
				arr[i] = new ArrayList<Integer>();
			}
		}

		char s = in.readLine().charAt(0);
		outer: while (s != 'q') {
			if (s == 'i') {
				int a = Integer.parseInt(in.readLine()), b = Integer.parseInt(in.readLine());
				if (!arr[a].contains(b)) {
					arr[a].add(b);
					arr[b].add(a);
				}
			} else if (s == 'd') {
				int a = Integer.parseInt(in.readLine()), b = Integer.parseInt(in.readLine());
				if (arr[a].contains(b)) {
					arr[a].remove(arr[a].indexOf(b));
					arr[b].remove(arr[b].indexOf(a));
				}
			} else if (s == 'n') {
				int a = Integer.parseInt(in.readLine());
				System.out.println(arr[a].size());
			} else if (s == 'f') {
				int a = Integer.parseInt(in.readLine());
				Queue<Integer> q = new LinkedList<Integer>();
				HashSet<Integer> set = new HashSet<Integer>();
				for (int i : arr[a]) {
					q.add(i);
				}
				while (!q.isEmpty()) {
					int n = q.poll();
					for (int i : arr[n]) {
						if (arr[i].contains(a) || i == a)
							continue;
						set.add(i);
					}
				}
				System.out.println(set.size());
			} else if (s == 's') {
				int a = Integer.parseInt(in.readLine()), b = Integer.parseInt(in.readLine());
				Queue<int[]> q = new LinkedList<int[]>();
				boolean visited[] = new boolean[51];
				for (int i : arr[a]) {
					q.add(new int[] { i, 1 });
				}
				while (!q.isEmpty()) {
					int c[] = q.poll();
					if (visited[c[0]]) {
						continue;
					} else {
						visited[c[0]] = true;
						if (visited[b]) {
							System.out.println(c[1]);
							s = in.readLine().charAt(0);
							continue outer;
						}
						for (int i : arr[c[0]]) {
							q.add(new int[] { i, c[1] + 1 });
						}
					}
				}
				System.out.println("Not connected");
			}
			s = in.readLine().charAt(0);
		}

	}

}
