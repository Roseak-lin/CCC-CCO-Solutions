package CCC_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int r = Integer.parseInt(in.readLine());
		ArrayList<Character> a = new ArrayList();

		for (int i = 0; i < r; i++) {
			Stack<Integer> s = new Stack();
			Stack<Integer> s1 = new Stack();
			s1.push(0);
			int r2 = (Integer.parseInt(in.readLine()));
			boolean br = true;
			int curr = 1;

			for (int j = 0; j < r2; j++) {
				s.push(Integer.parseInt(in.readLine()));
			}
			if (r2 <= 3) {
				System.out.println("Y");
				br = false;
			}
			while (!s.empty()) {
				if (s.peek() == curr) {
					s.pop();
					curr++;
				} else if (s1.peek() == curr) {
					s1.pop();
					curr++;
				} else {
					s1.push(s.peek());
					s.pop();
				}
				if (s.empty() && s1.peek() != curr) {
					a.add('N');
					br = false;
					break;
				}
			}
			if (br)
				a.add('Y');
		}

		for (char i : a) {
			System.out.println(i);
		}

	}

}
