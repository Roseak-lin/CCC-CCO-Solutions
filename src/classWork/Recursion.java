package classWork;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(factorial(a));
		System.out.println(fib(a));
	}

	static long fib(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	static long factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}