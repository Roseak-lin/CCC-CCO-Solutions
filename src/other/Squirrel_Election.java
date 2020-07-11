package other;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class Squirrel_Election {
	static int dp[];
	static int min;

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		int towns = Integer.parseInt(s.nextToken());
		int votes = 0;
		int v[] = new int[towns + 1], c[] = new int[towns + 1];
		for (int i = 0; i < towns; i++) {
			s = new StringTokenizer(in.readLine());
			c[i] = Integer.parseInt(s.nextToken()) / 2 + 1;
			int val = Integer.parseInt(s.nextToken());
			votes += val;
			v[i] = val;
		}
		
		System.out.println(min);
	}

}