import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		boolean c = false;
		
		for (int i = 1; i <= b; i++) {
		    if ((-6 * (i*i*i*i)) + (a * (i*i*i)) + (2 * (i*i)) + i <= 0) {
		        System.out.println("The balloon first touches ground at hour: \n" + i);
		        c = true;
		        break;
		    }
		}
		if (!c) System.out.println("The balloon does not touch ground in the given time."); 
    }
}