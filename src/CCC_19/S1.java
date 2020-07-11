package CCC_19;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

public class S1 {
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws IOException {
		solve();
	}

	public static void solve() throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		int n = Integer.parseInt(in.readLine());
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(in.readLine());
			if (a == 0 && s.size() != 0) {
				s.pop();
			} else if (a != 0) {
				s.push(a);
			}
		}
		int sum = 0;
		while (!s.isEmpty()) {
			sum += s.peek();
			s.pop();
		}
		pw.println(sum);
		pw.flush();
		return;
	}

}
