package CCC_14;
import java.util.Scanner;

public class CCC2014j3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s1 = 100;
		int s2 = 100;
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			String temp = in.nextLine();
			if (i == 0)
			temp = in.nextLine();
			String a[] = temp.split(" ");

			if (Integer.parseInt(a[0]) > Integer.parseInt(a[1])) {
				s2 -= Integer.parseInt(a[0]);
			} else if (Integer.parseInt(a[0]) < Integer.parseInt(a[1])){
				s1 -= Integer.parseInt(a[1]);
			} else {
				continue;
			}
			
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}