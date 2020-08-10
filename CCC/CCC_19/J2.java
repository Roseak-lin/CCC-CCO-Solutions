package CCC_19;
import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int l = in.nextInt();
		String[] arr = new String[l];
		for (int i = 0; i < l; i++) {
			if (i == 0)
				arr[i] = in.nextLine();
			arr[i] = in.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			String[] s = arr[i].split(" ");
			for (int j = 0; j < Integer.parseInt(s[0]); j++) {
				System.out.print(s[1]);
			}
			System.out.println("");
		}

	}

}
