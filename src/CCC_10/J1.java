import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int count = 0;
	
	for(int a = 0; a <= 5; a++) {
		for(int b = 0; b <= 5; b++) {
			if(a + b == n) {
			    if (a == b)
			        count++;
				count++;
			}
		}
	}
	
	System.out.println(count/2);
    }
}