package classWork;

public class WaysToCoverDistance {

	public static void main(String[] args) {
		System.out.println(getWays(3));
	}

	static int getWays(int n) {
		int count[] = new int[n + 2];
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;

		for (int i = 3; i <= n; i++) {
			count[i] = count[i - 1] + count[i - 2] + count[i - 2];
		}
		return count[n];

	}

}
