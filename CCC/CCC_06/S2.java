import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine();
		String s2 = in.readLine();
		String word = "";
		String code = in.readLine();
		for (int i = 0; i < code.length(); i++) {
			if (s2.indexOf(code.charAt(i)) == -1) word += "."; 
			else word += s1.charAt(s2.indexOf(code.charAt(i)));
		}
		System.out.println(word);
	}

}