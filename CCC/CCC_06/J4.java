package CCC_06;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class J4 {
	static ArrayList<Integer> rules[] = new ArrayList[8];

	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		int n1 = -1, n2 = -1;
		for (int i = 0; i < 8; i++) {
			rules[i] = new ArrayList<Integer>();
		}
		rules[7].add(1);
		rules[4].add(1);
		rules[1].add(2);
		rules[4].add(3);
		rules[5].add(3);

		while (true) {
			n1 = Integer.parseInt(in.readLine());
			n2 = Integer.parseInt(in.readLine());
			if (n1 != -1) {
				rules[n2].add(n1);
			}
			if (n1 == 0 && n2 == 0) {
				in.close();
				break;
			}
		}

		boolean performed[] = new boolean[8];
		LinkedList<Integer> q = new LinkedList<Integer>();
		int cars = 0;
		int visited[] = new int[8];
		LinkedList<Integer> c = new LinkedList();
		while (cars != 7) {
			for (int i = 1; i <= 7; i++) {
				visited[i]++;
				if (visited[i] > 7) {
					System.out.println("Cannot complete these tasks. Going to bed.");
					System.exit(0);
				}
				boolean flag = false;
				if (!performed[i]) {
					for (int x : rules[i]) {
						if (!performed[x]) {
							flag = true;
							break;
						}
					}

					if (!flag) {
						performed[i] = true;
						c.add(i);
						cars++;
						break;
					}
				}
			}
		}
//		System.out.println(c);
		for (int i : c) {
			System.out.print(i + " ");
		}
	}

}
