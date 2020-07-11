
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Character> arr = new ArrayList<Character>();
		ArrayList<String> arr2 = new ArrayList<String>();
		String phrase = in.next();
		arr2.add(phrase);
		String find = in.next();
		boolean no = true;
		for (int i = 0; i < find.length(); i++) {
			arr.add(find.charAt(i));
		}
		if ((phrase.length() >= find.length())) {
			for (int i = 0; i < arr.size(); i++) {
				String newW = "";
				for (int j = 0; j < arr.size(); j++) {
					newW += arr.get(j);
				}
				if (phrase.contains(newW)) {
					no = false;
					System.out.println("yes");
					break;
				}
				char temp = arr.get(0);
				arr.remove(0);
				arr.add(arr.size(), temp);
			}
		}
		if (no) {
			System.out.println("no");
		}
	}

}