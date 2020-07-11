package classPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitCharacter {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num = in.readLine();
		
	}
	static boolean bit(String n) {
		if (n.equals("0")) {
			return true;
		} else {
			return false;
		}
	}
}
