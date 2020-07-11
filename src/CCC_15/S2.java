package CCC_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2 {

	public static void main(String[] args) throws NullPointerException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int req = 0;
		Map<Integer, Integer> jersey = new HashMap<Integer, Integer>();
		StringTokenizer s1 = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(s1.nextToken());
		StringTokenizer s2 = new StringTokenizer(in.readLine());
		int b = Integer.parseInt(s2.nextToken());
		for (int i = 1; i <= a; i++) {
			StringTokenizer s = new StringTokenizer(in.readLine());
			String size = s.nextToken();
			if (size.equals("S")) {
				jersey.put(i, 1);
			} else if (size.equals("M")) {
				jersey.put(i, 2);
			} else {
				jersey.put(i, 3);
			}

		}
		
		for (int i = 0; i < b; i++) {
			String temp[] = in.readLine().split(" ");
			String size = temp[0];
			int num = Integer.parseInt(temp[1]);
			int s;
			if (size.equals("L")) {
				s = 3;
			} else if (size.equals("M")) {
				s = 2;
			} else {
				s = 1;
			}
			if (jersey.containsKey(num)) {
				if (jersey.get(num) >= s) {
					req++;
					jersey.remove(num);
				}
			}

		}
		System.out.println(req);
	}

	
}