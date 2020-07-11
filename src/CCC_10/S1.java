package CCC_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l1 = 0;
		int l2 = 0;
		String c1 = "";
		String c2 = "";
		int r = in.nextInt();
		Map<String, Integer> m = new HashMap();
		for (int i = 0; i < r; i++) {
			String name = in.next();
			int ram = in.nextInt();
			int cpu = in.nextInt();
			int disk = in.nextInt();
			int per = 2 * ram + 3 * cpu + disk;
			m.put(name, per);
			
		}
		System.out.println(m);
		for (String k : m.keySet()) {
			System.out.println(k);
//			char a[] = c1.toCharArray();
//			char[] b = c2.toCharArray();
//			char c[] = k.toCharArray();
//			int f1 = 0;
//			int f2 = 0;
//			int f3 = 0;
//			for (int i = 0; i < a.length; i++) {
//				f1 += a[i];
//			}
//			for (int i = 0; i < b.length; i++) {
//				f2 += b[i];
//			}
//			for (int i = 0; i < c.length; i++) {
//				f3 += c[i];
//			}
			if (m.get(k) > l1) {
				c2 = c1;
				c1 = k;
				l2 = l1;
				l1 = m.get(k);
			} else if (m.get(k) > l2) {
				c2 = k;
				l2 = m.get(k);
			} else if (m.get(k) == l1) {
				int i = 0;
				do {
					if (k.charAt(i) < c1.charAt(i)) {
						c2 = c1;
						c1 = k;
						l2 = l1;
						l1 = m.get(k);
						System.out.println(k.charAt(i) + " " + c1.charAt(i) + " run1");
						break;
					} else if (k.charAt(i) > c1.charAt(i)) {
						System.out.println(k.charAt(i) + " " + c1.charAt(i) + " run2");
						c2 = k;
						l2 = m.get(k);
						break;
					}
					i++;
				} while (k.charAt(i) == (c1.charAt(i)));
				if (k.charAt(i) < c1.charAt(i)) {
					System.out.println(k.charAt(i) + " " + c1.charAt(i) + " run3");
					c2 = c1;
					c1 = k;
					l2 = l1;
					l1 = m.get(k);
				} else if (k.charAt(i) > c1.charAt(i)) {
					System.out.println(k.charAt(i) + " " + c1.charAt(i) + " run12");
					c2 = k;
					l2 = m.get(k);
				}
			} else if (m.get(k) == l2) {
				int i = 0;
				do {
					if (k.charAt(i) < c2.charAt(i)) {
						c2 = k;
						l2 = m.get(k);
						break;
					}
					i++;
				} while (k.charAt(i) == (c2.charAt(i)));
				if (k.charAt(i) < c2.charAt(i)) {
					c2 = k;
					l2 = m.get(k);
				}
				
			}
			System.out.println(c1 + "\t" + c2);
		}

		System.out.println(c1 + "\n" + c2);
	}

}