import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
	    String a = in.readLine();
	    String b = in.readLine();
	    
	    int[] c = new int[26];
	    int[] d = new int[26];
	    char[] e = new char[26];
	    int wildcard = 0;
	    boolean anagram = true;
	    int temp = 0;
	    for (char i = 'a'; i <= 'z'; i++) {
	        e[temp] = i;
	        temp++;
	    }
	    if (c.length != d.length) {
	        anagram = false;
	    } else {
	    for (int i = 0; i < a.length(); i++) {
	        for (int j = 0; j < c.length; j++) {
	            if (e[j] == a.charAt(i)) {
	                c[j]++;
	            }
	        }
	    }
	    
	    for (int i = 0; i < b.length(); i++) {
	        for (int j = 0; j < d.length; j++) {
	            if (e[j] == b.charAt(i)) {
	                d[j]++;
	                } 
	            }
	            if (b.charAt(i) == '*') {
	                wildcard++;
	            }  
	        }
	        
	  
	    aCheck:
	    for (int i = 0; i < c.length; i++) {
	        for (int j = 0; j <= wildcard; j++) {
	        if (c[i] == d[i] + j) {
	            wildcard -= j;
	            continue aCheck;
	            }
	        } 
	        if (c[i] == d[i]) {
	            continue;
	        } else {
	            anagram = false;
	            break;
	        
	        }
	    }
	    }
	        if (anagram) {
	            System.out.println("A");
	        } else {
	            System.out.println("N");
	        }
	    
    }
}