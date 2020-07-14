import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j2_2015 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int happy = 0, sad = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.substring(i, i + 3).equals(":-)")) {
				happy++;
			} else if (s.substring(i, i + 3).equals(":-(")) {
			    sad++;
			}
		}
		if (happy > sad)
			System.out.println("happy");
		else if (happy < sad)
			System.out.println("sad");
		else if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else
			System.out.println("unsure");
	}
}