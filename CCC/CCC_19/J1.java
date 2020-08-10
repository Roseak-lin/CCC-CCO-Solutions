package CCC_19;
import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		a += arr[0] * 3;
		a += arr[1] * 2;
		a += arr[2];
		b += arr[3] * 3;
		b += arr[4] * 2;
		b += arr[5];
		
		if (a > b)
			System.out.println("A");
		else if (b > a)
			System.out.println("B");
		else 
			System.out.println("T");

	}

}