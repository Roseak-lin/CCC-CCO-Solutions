package resources;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class Knapsack {

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		int items = Integer.parseInt(s.nextToken()), max = Integer.parseInt(s.nextToken());
		long v[] = new long[items], w[] = new long[items];
		for (int i = 0; i < items; i++) {
			s = new StringTokenizer(in.readLine());
			w[i] = Integer.parseInt(s.nextToken());
			v[i] = Integer.parseInt(s.nextToken());
		}

		long[] dp = new long[max + 1];

		for (int i = 0; i < items; i++) {
			for (int j = max; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], v[i] + dp[(int) (j - w[i])]);
			}
		}
		System.out.println(dp[max]);
	}
}
