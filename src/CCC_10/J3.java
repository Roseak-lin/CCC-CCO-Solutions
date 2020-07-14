import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0;
		String t[] = in.readLine().split(" ");
		
		while (!t[0].equals("7")) {
		    switch(t[0]) {
		        case "1":
		            if (t[1].equals("A")) a = Integer.parseInt(t[2]);
		            else b = Integer.parseInt(t[2]);
		            break;
		        case "2":
		            if (t[1].equals("A")) System.out.println(a);
		            else System.out.println(b);
		            break;
		        case "3":
		            if (t[1].equals("A") && t[2].equals("A")) a += a;
		            else if ((t[1].equals("B") && t[2].equals("B"))) b += b;
		            else if ((t[1].equals("A") && t[2].equals("B"))) a += b;
		            else b += a;
		            break;
		        case "4":
		            if (t[1].equals("A") && t[2].equals("A")) a *= a;
		            else if ((t[1].equals("B") && t[2].equals("B"))) b *= b;
		            else if ((t[1].equals("A") && t[2].equals("B"))) a *= b;
		            else b *= a;
		            break;
		        case "5":
		            if (t[1].equals("A") && t[2].equals("A")) a -= a;
		            else if ((t[1].equals("B") && t[2].equals("B"))) b -= b;
		            else if ((t[1].equals("A") && t[2].equals("B"))) a -= b;
		            else b -= a;
		            break;
		        case "6":
		            if ((t[1].equals("A") && t[2].equals("B"))) a = a/b;
		            else b = b/a;
		            break;
		           
		    }
		    t = in.readLine().split(" ");
		}
		
	}
}