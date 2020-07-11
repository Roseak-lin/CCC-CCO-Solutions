package CCC_20;
import java.io.*;
import java.util.*;

public class J3 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int mostL = 0, mostR = 0, mostU = 0, mostD = 0;
		int p = in.nextInt();
		in.nextLine();

		for (int i = 0; i < p; i++) {
			String temp[] = in.nextLine().split(",");
			int num1 = Integer.parseInt(temp[0]);
			int num2 = Integer.parseInt(temp[1]);
			// System.out.println(arr[i][1] + " " + mostD + " " + mostU);
			if (i == 0) {
				mostL = num1;
				mostR = num1;
				mostU = num2;
				mostD = num2;
			} else {
				if (num1 < mostL) {
					mostL = num1;
				}
				if (num1 > mostR) {
					mostR = num1;
				}
				if (num2 > mostU) {
					mostU = num2;
				}
				if (num2 < mostD) {
					mostD = num2;
				}
			}
		}

		System.out.println((mostL - 1) + "," + (mostD - 1));
		System.out.println((mostR + 1) + "," + (mostU + 1));



	}

}