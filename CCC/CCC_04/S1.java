import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		outer: while (n-- != 0) {
			String arr[] = { in.readLine(), in.readLine(), in.readLine() };
			Arrays.parallelSort(arr, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return o1.length() - o2.length();
				}
			});
			if (arr[0].equals(arr[1]) || arr[0].equals(arr[2]) || arr[1].equals(arr[2])) {
				System.out.println("No");
				continue outer;
			}
			// suffix
			if (arr[1].lastIndexOf(arr[0]) == arr[1].length() - arr[0].length() || arr[2].lastIndexOf(arr[0]) == arr[2].length() - arr[0].length() || arr[2].lastIndexOf(arr[1]) == arr[2].length() - arr[1].length()) {
				System.out.println("No");
				continue outer;
			// prefix
			} else if (arr[1].indexOf(arr[0]) == 0 || arr[2].indexOf(arr[0]) == 0 || arr[2].indexOf(arr[1]) == 0) {
				System.out.println("No");
				continue outer;
			}
			System.out.println("Yes");
		}
	}

}