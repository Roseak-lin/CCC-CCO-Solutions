package CCC_20;

import java.util.*;
import java.text.*;

public class S1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ob = in.nextInt();
		double largest = 0;
		HashMap<Long, Long> map = new HashMap();
		for (int i = 0; i < ob; i++) {
			long n1 = in.nextLong();
			long n2 = in.nextLong();
			map.put(n1, n2);
		}
		ArrayList<Long> arr = new ArrayList<Long>(map.keySet());
		Collections.sort(arr);

		for (int i = 0; i < arr.size() - 1; i++) {
			double t = Math.abs(map.get(arr.get(i)) - map.get(arr.get(i + 1)));
			double d = Math.abs(arr.get(i) - arr.get(i + 1));
			//System.out.println(d + " " + t);
			if (t/d > largest) largest = t/d;
		}
		System.out.println(largest);
	}
}