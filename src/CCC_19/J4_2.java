package CCC_19;

import java.util.Scanner;

public class J4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String u = input.nextLine();
		String[] a = u.split("");
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			int temp;
			if (a[i].equalsIgnoreCase("h")) {
				temp = arr[0];
				arr[0] = arr[2];
				arr[2] = temp;
				temp = arr[1];
				arr[1] = arr[3];
				arr[3] = temp;
			} else if (a[i].equalsIgnoreCase("v")) {
				temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				temp = arr[2];
				arr[2] = arr[3];
				arr[3] = temp;
			}
		}
		System.out.println(arr[0] + " " + arr[1] + "\n" + arr[2] + " " + arr[3]);
	}

}
