package CCC_14;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2014s1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList();
		int a = in.nextInt();
		arr.add(0);
		for (int i = 1; i <= a; i++) {
			arr.add(i);
		}

		int b = in.nextInt();
		for (int i = 0; i < b; i++) {
			int temp = in.nextInt();
			for (int j = 1; j < arr.size(); j++) {
				if (j % temp == 0) {
					arr.set(j, -1);
				}
			}
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(j) == -1) {
					arr.remove(j);
				}
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == -1) {
				arr.remove(i);
			}
		}

		for (int i = 1; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}