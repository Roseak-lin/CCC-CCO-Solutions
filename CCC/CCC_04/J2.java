import java.io.*;
import java.util.*;

public class J2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <= b; i+=60) {
		    System.out.println("All positions change in year " + i);
		}
    }
}