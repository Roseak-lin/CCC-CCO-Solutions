package CCC_20;
import java.io.*;
import java.util.*;

public class J5 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		int x = in.nextInt();
		int arr[][] = new int[x + 1][y + 1];

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		boolean contains = false;
		boolean poss = false;

		outer: for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				if (arr[i][j] == x * y && (i != x || j != y)) {
					contains = true;
					break outer;
				}
			}
		}
		int curr = arr[1][1];
		int count = 0;
		boolean visited[][] = new boolean[x + 1][y + 1];
//		if (contains && arr[1][1] != 1 && y != 1) {
//			outer: for (int i = 1; i <= x; i++) {
//				for (int j = 1; j <= y; j++) {
//					System.out.println(curr + " " + i + " " + j);
//					if (arr[1][1] > x && arr[1][1] > y && arr[1][1] != x * y) {
//						break outer;
//					}
//					if (i * j == curr && !visited[i][j]) {
//						curr = arr[i][j];
//						visited[i][j] = true;
//						continue;
//					}
//					if (i * j == curr && !visited[j][i]) {
//						curr = arr[j][i];
//						visited[j][i] = true;
//						continue;
//					}
//					if (curr == x * y) {
//						poss = true;
//						break outer;
//					}
//				}
//			}
//		}
		if (contains && arr[1][1] != 1 && y != 1) {
			loop: while (curr != x * y) {
				if (arr[1][1] > x && arr[1][1] > y && arr[1][1] != x * y) {
					break;
				}
				for (int i = 1; i <= x; i++) {
					for (int j = 1; j <= y; j++) {
						System.out.println(curr + " " + i + " " + j);
						if (i * j == curr && (isPrime(arr[i][j]) && arr[i][j] <= x && arr[i][j] <= y)) {
							if (!visited[i][j]) {
								curr = arr[i][j];
								visited[i][j] = true;
								continue;
							} else if (!visited[j][i] && (isPrime(arr[i][j]) && arr[i][j] <= x && arr[i][j] <= y)) {
								curr = arr[j][i];
								visited[j][i] = true;
								continue;
							}
							continue;
						}
					}
				}
			}
		}
		System.out.println(curr);
		case1: while (true && contains && y == 1) {
			if (curr == 1 || curr > x) {
				break case1;
			}
			if (curr == x) {
				poss = true;
				break;
			}
			curr = arr[curr][1];
		}
		if (poss) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	static boolean isPrime(int a) {
		if (a <= 2) {
			return true;
		}
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

//	static boolean BFS(int start, int end) {
//		LinkedList<Integer> queue = new LinkedList();
//		LinkedList<Integer> toVisit = new LinkedList();
//		boolean visited[] = new boolean[end];
//		
//	}
}