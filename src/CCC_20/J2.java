package CCC_20;
import java.io.*;
import java.util.*;

public class J2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();
		int days = 0;
		int infected = n;
		int temp = n;
		for (int i = 0; i <= p; i++) {
			if (infected > p) {
				days = i;
				break;
			}
			//System.out.println(r + " " + i);
			infected += r * temp;
			temp = r*temp;
		}
		System.out.println(days);
	}

}
