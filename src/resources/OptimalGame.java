package resources;

import java.io.*;

public class OptimalGame {

	static int optimalStrategyOfGame(int arr[]) {
		int table[][] = new int[arr.length][arr.length];
		for (int gap = 0; gap < arr.length; ++gap) {
			for (int i = 0, j = gap; j < arr.length; ++i, ++j) {
				int x = ((i + 2) <= j) ? table[i + 2][j] : 0;
				int y = ((i + 1) <= (j - 1)) ? table[i + 1][j - 1] : 0;
				int z = (i <= (j - 2)) ? table[i][j - 2] : 0;
				table[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
			}
		}

		return table[0][arr.length - 1];
	}

	public static void main(String[] args) {
		int arr1[] = { 8, 15, 3, 7 };
		int n = arr1.length;
		System.out.println(optimalStrategyOfGame(arr1));

		int arr2[] = { 2, 2, 2, 2 };
		n = arr2.length;
		System.out.println(optimalStrategyOfGame(arr2));

		int arr3[] = { 20, 30, 2, 2, 2, 10 };
		n = arr3.length;
		System.out.println(optimalStrategyOfGame(arr3));
	}
}
