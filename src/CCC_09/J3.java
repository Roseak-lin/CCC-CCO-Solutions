import java.io.*;
import java.util.*;

public class J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = n-300;
		int e = n-200;
		int w = n-100;
		int t = n;
		int h = n+100;
		int stj = n+130;
		
		if(v < 0) {
			v += 2400;
		}
		if (e < 0) {
			e += 2400;
		}
		if(w < 0) {
			w += 2400;
		}
		if(h < 0) {
			h += 2400;
		}
		if(stj < 0) {
			stj += 2400;
		}
		if(v > 2400) {
			v -= 2400;
		}
		if(e>2400) {
			e -= 2400;
		}
		if(w>2400) {
			w -= 2400;
		}
		if(h>2400) {
			h -= 2400;
		}
		if(stj>2400) {
			stj -= 2400;
		}
		if(stj/10%10>5) {
			stj = stj-60+100;
		}
		
		System.out.println(n + " in Ottawa");
		System.out.println(v + " in Victoria");
		System.out.println(e + " in Edmonton");
		System.out.println(w + " in Winnipeg");
		System.out.println(n + " in Toronto");
		System.out.println(h + " in Halifax");
		System.out.println(stj + " in St. John's");
	}
}