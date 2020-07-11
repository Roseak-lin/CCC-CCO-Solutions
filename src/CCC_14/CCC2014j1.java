package CCC_14;
import java.util.Scanner;

public class CCC2014j1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		if (arr[0] + arr[1] + arr[2] == 180) {
			if (arr[0] == arr[1] && arr[0] == arr[2]) {
				System.out.println("Equilateral");
			} else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]) {
				System.out.println("Scalene");
			} else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]){
				System.out.println("Isosceles");
			}
		} else {
			System.out.println("Error");
		}
	}
}
