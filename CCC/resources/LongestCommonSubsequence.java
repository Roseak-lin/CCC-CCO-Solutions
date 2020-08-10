package resources;

import java.io.DataInputStream;
import java.util.StringTokenizer;

public class LongestCommonSubsequence {

	static int lcs(int arr1[], int arr2[]) {
		int arr[][] = new int[arr1.length + 1][arr2.length + 1];

		for (int i = 1; i <= arr1.length; i++) {
			for (int j = 1; j <= arr2.length; j++) {
				if (arr1[i - 1] == arr2[j - 1]) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
				} else {
					arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
				}
			}
		}
		return arr[arr1.length][arr2.length];
	}

	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		int s1 = Integer.parseInt(s.nextToken()), s2 = Integer.parseInt(s.nextToken());
		s = new StringTokenizer(in.readLine());
		int arr1[] = new int[s1];
		int arr2[] = new int[s2];
		for (int i = 0; i < s1; i++) {
			arr1[i] = Integer.parseInt(s.nextToken());
		}
		s = new StringTokenizer(in.readLine());
		for (int i = 0; i < s2; i++) {
			arr2[i] = Integer.parseInt(s.nextToken());
		}

		System.out.println(lcs(arr1, arr2));
	}

}