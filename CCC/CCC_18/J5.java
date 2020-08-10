package CCC_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int arr[][] = new int[p + 1][];
		ArrayList<Integer> poss = new ArrayList<Integer>();
		if (p == 1) {
			System.out.println("Y\n");
			System.exit(0);
		}
		arr[0] = new int[0];
		for (int i = 1; i <= p; i++) {
			int n = in.nextInt();
			if (n == 0) {
				arr[i] = new int[] { 0 };
				continue;
			}
			arr[i] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		LinkedList<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { 1, 1 });
		boolean visited[] = new boolean[p + 1];

		int moves = 99999;
		while (!queue.isEmpty()) {
			int page[] = queue.poll();
//			System.out.println(page[0] + " " + poss);
			if (visited[page[0]]) {
				continue;
			} else {
				if (!poss.contains(page[0]) && page[0] != 1 && page[0] != 0) {
					poss.add(page[0]);
				}
				visited[page[0]] = true;
				for (int i : arr[page[0]]) {
					if (i == 0) {
						moves = Math.min(moves, page[1]);
					}
					queue.addLast(new int[] { i, page[1] + 1 });
				}
			}
		}
		if (poss.size() != p - 1) {
			System.out.println("N\n" + moves);
		} else {
			System.out.println("Y\n" + moves);
		}
	}

}
