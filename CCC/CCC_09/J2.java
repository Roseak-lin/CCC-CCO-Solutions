import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		int c = Integer.parseInt(in.readLine());
		int d = Integer.parseInt(in.readLine());

		for (int i = 0; i < (int)d/a+1; i++) {
			for (int j = 0; j < (int)d/b+1; j++) {
				for (int x = 0; x < (int)d/c+1; x++) {
//					System.out.println(i + " " + j + " " + x);
					if (i * a + j * b + x * c <= d && i + j  + x != 0) {
						System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + x + " Yellow Pickerel");
						count++;
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + count);
	}

}