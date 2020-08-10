package CCC_13;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class J3 {

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		int year = Integer.parseInt(in.readLine()) + 1;
		in.close();
		if (year < 10) {
			System.out.println(year);
			return;
		}
		if (year == 10000) {
			System.out.println(10234);
			return;
		}
		
		while (!unique(year)) {
			year++;
		}
		System.out.println(year);

	}
	
	static boolean unique(int n) {
		String y[] = Integer.toString(n).split("");
		LinkedList<Integer> list = new LinkedList();
		for (int i = 0; i < y.length; i++) {
			if (list.contains(Integer.parseInt(y[i]))) {
				return false;
			}
			list.add(Integer.parseInt(y[i]));
		}
		return true;
	}

}
