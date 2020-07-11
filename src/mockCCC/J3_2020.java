package mockCCC;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class J3_2020 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		NumberFormat n = new DecimalFormat("######.###");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double result = x * (y / 2) / 2;
		System.out.println(result);

	}

}
