package resources;

public class CoinChange {

	static long countWays(int S[], int m, int n) {
		long[] arr = new long[n + 1];
		arr[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				arr[j] += arr[j - S[i]];
				for (long x : arr) {
					System.out.print(x + " ");
				}
				System.out.println();
			}
		}
		return arr[n];
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 4 };
		int m = arr.length;
		int n = 4;
		System.out.println("\n" + countWays(arr, m, n));
	}

}
