package classWork;

import java.util.Arrays;

public class DivideAndConquer {

	public static void main(String[] args) {
		int[] a = { 7, 9, 2, 3, 1 };
		a = sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	static int[] sort(int[] arr) {
		int n = arr.length;
		if (n < 2) {
			return arr;
		}
		int left[] = Arrays.copyOfRange(arr, 0, n / 2);
		int right[] = Arrays.copyOfRange(arr, n / 2, n);
		int[] sortedLeft = sort(left);
		int[] sortedRight = sort(right);
		return merge(sortedLeft, sortedRight, n);
	}

	static int[] merge(int[] left, int right[], int n) {
		int result[] = new int[n];
		int l = 0;
		int r = 0;

		for (int i = 0; i < n; i++) {
			if (l < left.length && (r >= right.length || left[l] < right[r])) {
				result[i] = left[l];
				l++;
			} else {
				result[i] = right[r];
				r++;
			}
		}
		return result;
	}

}