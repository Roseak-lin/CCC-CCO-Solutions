package CCC_15;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class J4 {
	static int arr[] = new int[101];
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static boolean sent[] = new boolean[101];

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		int nums = Integer.parseInt(in.readLine());
		HashSet<Integer> q = new HashSet<Integer>();
		for (int i = 0; i < nums; i++) {
			StringTokenizer s = new StringTokenizer(in.readLine());
			String s1 = s.nextToken();
			
			int b = Integer.parseInt(s.nextToken());
			if (s1.equals("R")) {
				map.put(b, arr[b] - 1);
				q.add(b);
				if (map.containsKey(b)) {
					sent[b] = false;
				}
			} else if (s1.equals("S")) {
				map.put(b, arr[b]);
				sent[b] = true;
				q.remove(b);
			} else {
				for (int j : q) {
					arr[j] += b - 1;
				}
				continue;
			}

			for (int j : q) {
				arr[j]++;
			}
		}

		ArrayList<Integer> arr = new ArrayList<Integer>(map.keySet());
		Collections.sort(arr);
		for (int i : arr) {
			System.out.println(i + " " + (sent[i] == true ? map.get(i) : -1));
		}

	}

}
