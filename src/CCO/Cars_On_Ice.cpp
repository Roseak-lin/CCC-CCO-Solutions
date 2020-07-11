package CCO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cars_On_Ice {
	static char[][] arr;
	static int x, y;

	static void check(int currX, int currY) throws StackOverflowError {
		if (arr[currY][currX] == 'W') {
			for (int i = currX - 1; i > -1; i--) {
				if (arr[currY][i] != '.') {
					check(i, currY);
				}
			}
			System.out.println("(" + currY + ',' + currX + ")");
		} else if (arr[currY][currX] == 'E') {
			for (int i = currX + 1; i < x; i++) {
				if (arr[currY][i] != '.') {
					check(i, currY);
				}
			}
			System.out.println("(" + currY + ',' + currX + ")");
		} else if (arr[currY][currX] == 'S') {
			for (int i = currY + 1; i < y; i++) {
				if (arr[i][currX] != '.') {
					check(currX, i);
				}
			}
			System.out.println("(" + currY + ',' + currX + ")");
		} else if (arr[currY][currX] == 'N') {
			for (int i = currY - 1; i > -1; i--) {
				if (arr[i][currX] != '.') {
					check(currX, i);
				}
			}
			System.out.println("(" + currY + ',' + currX + ")");
		}
		arr[currY][currX] = '.';
	}

	public static void main(String[] args) throws IOException, StackOverflowError {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(in.readLine());
		y = Integer.parseInt(s.nextToken());
		x = Integer.parseInt(s.nextToken());
		arr = new char[y][x];
		for (int i = 0; i < y; i++) {
			char temp[] = in.readLine().trim().toCharArray();
			for (int j = 0; j < x; j++) {
				arr[i][j] = temp[j];
				if (arr[i][j] == 'N' && i == 0) {
					System.out.println("(" + i + ',' + j + ")");
					arr[i][j] = '.';
					continue;
				} else if (arr[i][j] == 'S' && i == y - 1) {
					System.out.println("(" + i + ',' + j + ")");
					arr[i][j] = '.';
					continue;
				} else if (arr[i][j] == 'E' && j == x - 1) {
					System.out.println("(" + i + ',' + j + ")");
					arr[i][j] = '.';
					continue;
				} else if (arr[i][j] == 'W' && i == 0) {
					System.out.println("(" + i + ',' + j + ")");
					arr[i][j] = '.';
					continue;
				}

			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (arr[i][j] != '.') {
					check(j, i);
				}
			}
		}
	}

}