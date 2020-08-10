import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		DataInputStream in = new DataInputStream(System.in);
		int count1 = 0, count2 = 0;
		char[] c = new char[26];
		int temp = 0;
		int aCount[] = new int[26];
		int aCount1[] = new int[26];
		for (int i = 0; i < 26; i++) {
		    aCount[i] = 0;
		    aCount1[i] = 0;
		}
		for (char i = 'A'; i < 'Z'; i++) {
		    c[temp] = i;
		    temp++;
		}
		temp = 0;
		
		char a1[] = in.readLine().toCharArray();
		char a2[] = in.readLine().toCharArray();
		
		for (int i = 0; i < a1.length; i++) {
		    if (a1[temp] == ' ') {
		        temp++;
		        continue;
		    }
		    for (int j = 0; j < 26; j++) {
		        if (a1[temp] == c[j]) aCount[j]++;
		    }
		    temp++;
		}
	    temp = 0;
		for (int i = 0; i < a2.length; i++) {
		    if (a2[temp] == ' ') {
		        temp++;
		        continue;
		    }
		    for (int j = 0; j < 26; j++) {
		        if (a2[temp] == c[j]) aCount1[j]++;
		    }
		    temp++;
		}
	
		boolean b = true;
		for (int i = 0; i < 26; i++) {
		    if (aCount1[i] != aCount[i]) {
		        b = false;
		        System.out.println("Is not an anagram.");
		        break;
		    }
		}
		if (b) System.out.println("Is an anagram.");
	}
}