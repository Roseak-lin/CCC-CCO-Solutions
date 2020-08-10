package resources;

public class Prefix_Sum_Array {
	
	static int arr[] = { 5, 1, 3, 2, 4, 8 };
	static int prefixArr[] = new int[arr.length];
	public static void main(String[] args) {
		createArray(arr);
		for (int i : prefixArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		// sum of range between 3 and 5
		System.out.println(prefixArr[5] - prefixArr[2]);
		// sum of range between 1 and 4
		System.out.println(prefixArr[4] - prefixArr[0]);
	}

	static void createArray(int arr[]) {
		prefixArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = arr[i] + prefixArr[i - 1];
		}
	}
}
