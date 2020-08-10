package CCC_05;

import java.util.ArrayList;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<String> d = new ArrayList();
		ArrayList<String> s = new ArrayList();

		String l = in.nextLine();
		String l1 = in.nextLine();
		while (!l1.equals("SCHOOL")) {
			d.add(l);
			s.add(l1);
			l = in.nextLine();
			l1 = in.nextLine();
		}
		d.add(l);
		for (int i = s.size() - 1; i >= 0; i--) {
			if (d.get(i + 1).equals("L")) {
				System.out.println("Turn RIGHT onto " + s.get(i) + " street.");
			} else if (d.get(i + 1).equals("R")) {
				System.out.println("Turn LEFT onto " + s.get(i) + " street.");
			}
		}
		if (d.get(0).equals("L")) {
			System.out.println("Turn RIGHT into your HOME.");
		} else {
			System.out.println("Turn LEFT into your HOME.");
		}

	}

}
