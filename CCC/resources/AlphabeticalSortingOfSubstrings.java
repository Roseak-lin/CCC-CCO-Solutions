package resources;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AlphabeticalSortingOfSubstrings {
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer st = new StringTokenizer(in.readLine());
		String s = st.nextToken();
		st = new StringTokenizer(in.readLine());
		in.close();
		int k = Integer.parseInt(st.nextToken());
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length() - k + 1; i++) {
			list.add(s.substring(i, i + k));
		}
		Collections.sort(list, new compare(k));
		System.out.println(list);
		System.out.println(list.get(list.size() - 1) + "\n" + list.get(0));

	}

	static class compare implements Comparator {
		int n;

		compare(int n) {
			this.n = n;
		}

		public int compare(Object o1, Object o2) {
			String a = (String) o2;
			String b = (String) o1;
			if (a.equals(b))
				return 0;
			for (int i = 0; i < n; i++) {
				if (a.charAt(i) < b.charAt(i)) {
					return -1;
				} else if (a.charAt(i) > b.charAt(i)) {
					return 1;
				}
			}
			return 0;
		}
	}
}
