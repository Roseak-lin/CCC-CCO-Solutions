package CCC_00;

import java.util.ArrayList;
import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int streams = in.nextInt();
		for (int i = 0; i < streams; i++) {
			arr.add(in.nextInt());
		}
		while (true) {
			int command = in.nextInt();
			if (command == 77) {
				break;
			} else if (command == 99) {
				int split = in.nextInt() - 1;
				int percent = in.nextInt();
				int splitted = (int) Math.round((double) percent / 100 * arr.get(split));
//				System.out.println(arr.get(split) + " " + splitted);
				int splitted1 = arr.get(split) - splitted;
//				splitted -= splitted1;
				arr.add(split, splitted);
				arr.set(split + 1, splitted1);
			} else {
				int split = in.nextInt() - 1;
				int streas = split + 1;
				int val1 = arr.get(split);
				int val2 = arr.get(streas);
				arr.set(split, val1 + val2);
				arr.remove(streas);
			}
//			System.out.println(arr);

		}
		for (int stream : arr) {
			System.out.print(stream + " ");
		}
	}
}