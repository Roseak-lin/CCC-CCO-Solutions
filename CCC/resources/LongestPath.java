package resources;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LongestPath {
	static ArrayList<Integer> arr[] = new ArrayList[100001];
	static int dp[];

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		int nodes = Integer.parseInt(s.nextToken());
		int edges = Integer.parseInt(s.nextToken());
		for (int i = 1; i <= nodes; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < edges; i++) {
			s = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(s.nextToken()), y = Integer.parseInt(s.nextToken());
			arr[y].add(x);
		}
		dp = new int[nodes + 1];
		Arrays.fill(dp, -1);
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= nodes; i++) {
			max = Math.max(max, dfs(i));
		}
		System.out.println(max);
	}

	static int dfs(int n) {
//		System.out.println(n + " " + d + " " + arr[n].size());
		if (dp[n] != -1) {
			return dp[n];
		}
		int dist = 0;
		for (int i : arr[n]) {
			dist = Math.max(dfs(i) + 1, dist);
		}
		return dp[n] = dist;
	}

}