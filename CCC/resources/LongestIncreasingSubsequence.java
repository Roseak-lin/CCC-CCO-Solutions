package resources;

import java.io.DataInputStream;
import java.util.StringTokenizer;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) throws Exception{
		final DataInputStream in = new DataInputStream(System.in);
		final int nums = Integer.parseInt(in.readLine().trim());
		
		int arr[] = new int[nums];
		StringTokenizer s = new StringTokenizer(in.readLine());
		for (int i = 0; i < nums; i++) {
			arr[i] = Integer.parseInt(s.nextToken());
		}
		int lengths[] = new int[arr.length];
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			lengths[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					lengths[i] = Math.max(lengths[i], lengths[j] + 1);
				}
			}
			max = Math.max(lengths[i], max);
		}
		
		System.out.println(max);
	}

}
