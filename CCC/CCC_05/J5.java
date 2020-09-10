import java.io.*;

public class J5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String t = in.readLine();
		while (!t.equals("X")) {
			System.out.println(monkey(t) ? "YES" : "NO");
			t = in.readLine();
		}
	}

	static boolean monkey(String s) {
		if (aword(s)) {
			return true;
		}
		boolean b = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'N') {
				b = b || (aword(s.substring(0, i)) && monkey(s.substring(i + 1)));
			}
		}
		if (b) {
			return true;
		} else {
			return aword(s);
		}
	}

	static boolean aword(String s) {
		if (s.equals("A")) {
			return true;
		} else {
			if (s.startsWith("B") && s.endsWith("S")) {
				return monkey(s.substring(1, s.lastIndexOf('S')));
			} else {
				return false;
			}
		}
	}
	// BANANA
	// X
}