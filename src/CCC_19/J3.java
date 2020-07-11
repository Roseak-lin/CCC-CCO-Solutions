package CCC_19;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int l = in.nextInt();
		String arr[] = new String[l];

		for (int i = 0; i < l; i++) {
			if (i == 0)
				arr[i] = in.nextLine();
			arr[i] = in.nextLine();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			String s[] = arr[i].split("");
			for (int j = 1; j < s.length; j++) {
				if (s[j - 1].equals(s[j]) && j != s.length) {
					count++;
				} else {
					System.out.print(count + " " + s[j - 1] + " ");
					count = 1;
				}
			}
			System.out.print(count + " " + s[s.length - 1] + " ");
			System.out.println("");
		}
	}
}