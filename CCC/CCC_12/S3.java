package CCC_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class S3 {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(in.readLine());
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		if (n == 2 || map.size() == 2) {
			if (map.size() == 2) {
				System.out.println(Math.abs(map.get(0) - map.get(1)));
			} else {
				System.out.println(map.get(0));
			}
			return;
		}
		ArrayList<Integer> arr = new ArrayList(map.keySet());
		Collections.sort(arr, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if (map.get(o1) > map.get(o2)) {
					return 1;
				} else if (map.get(o1) == map.get(o2)) {
					if (o1 > o2) {
						return 1;
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}
		});

		if (map.get(arr.get(arr.size() - 1)) == map.get(arr.get(arr.size() - 2))) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(arr.get(arr.size() - 1));
			temp.add(arr.get(arr.size() - 2));
			int t = map.size() - 3;
			while (t > -1 && map.get(arr.get(t)) == map.get(temp.get(0))) {
				temp.add(arr.get(t));
				t--;
			}
			System.out.println(temp.get(0) - temp.get(temp.size() - 1));
		} else if (map.get(arr.get(arr.size() - 2)) == map.get(arr.get(arr.size() - 3))) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(arr.get(arr.size() - 2));
			temp.add(arr.get(arr.size() - 3));
			int t = map.size() - 4;
			while (t > -1 && map.get(arr.get(t)) == map.get(temp.get(0))) {
				temp.add(arr.get(t));
				t--;
			}
			int max = -1;
			for (int i : temp) {
				max = Math.max(Math.abs(arr.get(arr.size() - 1) - i), max);
			}
			System.out.println(max);
		} else {
			System.out.println(Math.abs(arr.get(arr.size() - 1) - arr.get(arr.size() - 2)));
		}

	}

}
