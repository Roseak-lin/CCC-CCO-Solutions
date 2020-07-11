package CCC_05;

import java.io.*;

public class J5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String t = in.readLine();
		System.out.println(monke(t));
	}

	static String aWord(String a) {
		if (a.equals("A")) {
			return "YES";
		} else if (a.length() == 1 && !a.equals("A")) {
			return "NO";
		} else {
			String temp = a.substring(0, a.length());
			if (a.indexOf("B") == 0 && a.indexOf("S") == a.length() - 1 && monke(temp).equals("YES")) {
				return "YES";
			} else {
				return "NO";
			}
		}
	}

	static String monke(String a) {
		if (aWord(a).equals("YES")) {
			return "YES";
		} else {
			if (a.contains("N")) {
				int i = a.indexOf("N");
				String a1 = a.substring(0, i);
				String a2 = a.substring(i + 1, a.length());
				if (aWord(a1).equals("YES") && monke(a2).equals("YES")) {
					return "YES";
				} else {
					return "NO";
				}
			} else {
				return "NO";
			}
		}
	}
}
