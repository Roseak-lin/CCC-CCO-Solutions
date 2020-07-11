package CCC_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(in.readLine());
		int count = 0;
		int gates = Integer.parseInt(s.nextToken());
		s = new StringTokenizer(in.readLine());
		int planes = Integer.parseInt(s.nextToken());
		boolean arr[] = new boolean[gates + 1];

		outer: for (int i = 0; i < planes; i++) {
			s = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(s.nextToken());
			for (int j = n; j >= 1; j--) {
				if (!arr[j]) {
					arr[j] = true;
					count++;
					continue outer;
				}
			}
			break;
		}
		System.out.println(count);
	}
}