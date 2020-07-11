package resources;

public class Difference_Array {
	static void initializeDiffArray(int A[], int D[]) {
		D[0] = A[0];
		D[A.length] = 0;
		for (int i = 1; i < A.length; i++)
			D[i] = A[i] - A[i - 1];
	}

	static void update(int D[], int start, int end, int x) {
		D[start] += x;
		D[end] -= x;
		
	}

	static int printArray(int A[], int D[]) {
		System.out.println("Original Array");
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println("\nDifference Array");
		for (int i : D) {
			System.out.print(i + " ");
		}
		System.out.println("\nNew Array");
		A[0] = D[0];
		System.out.print(A[0] + " ");
		for (int i = 1; i < A.length; i++) {
			A[i] = D[i] + A[i - 1];
			System.out.print(A[i] + " ");
		}

		System.out.println();

		return 0;
	}

	public static void main(String[] args) {
		int A[] = { 0, 5, 5, 5, 5, 5 };
		int D[] = new int[A.length + 1];
		initializeDiffArray(A, D);
		update(D, 3, 4, -1);
		printArray(A, D);

	}
}