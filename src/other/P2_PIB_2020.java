package other;

import java.util.Scanner;

public class P2_PIB_2020 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		if (time == 1) {
			System.out.println(2);
			return;
		}
		
		int problems = 0;
		System.out.println(time / 2 * 2);
		problems += (time / 2 * 2) * 7;
		System.out.println(time);
		time -= time / 2 * 2;
		
		if (time != 0) {
			problems += 2;
		}
		System.out.println(problems);
	}
}
