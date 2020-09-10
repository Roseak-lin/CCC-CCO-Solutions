import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());
		
		while (q-- != 0) {
			String last[] = new String[4];
			for (int i = 0; i < 4; i++) {
				String s = in.readLine().toUpperCase();
				int n = (Math.max(s.lastIndexOf('A'), Math.max(s.lastIndexOf('E'), Math.max(s.lastIndexOf('I'), Math.max(s.lastIndexOf('O'), s.lastIndexOf('U'))))));
				if (n != -1 && n > s.lastIndexOf(' ')) {
					last[i] = s.substring(n);
				} else {
					last[i] = s.substring(s.lastIndexOf(' ') + 1);
				}
			}
			if (last[0].equals(last[1]) && last[0].equals(last[2]) && last[0].equals(last[3])) {
				System.out.println("perfect");
			} else if (last[0].equals(last[1]) && last[2].equals(last[3])) {
				System.out.println("even");
			} else if (last[0].equals(last[2]) && last[1].equals(last[3])) {
				System.out.println("cross");
			} else if (last[0].equals(last[3]) && last[1].equals(last[2])) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}

	}

}