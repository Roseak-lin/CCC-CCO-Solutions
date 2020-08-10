import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int count = 0;
	int max = Integer.parseInt(in.readLine());
	Stack<Integer> s = new Stack(); 
	int trucks = Integer.parseInt(in.readLine());
	for (int i = 0; i < trucks; i++) {
	        int temp = Integer.parseInt(in.readLine());
	        if (s.size() < 4) {
	           s.push(temp);
	        } else {
	           s.remove(0);
	           s.push(temp);
	       }
	        if (sumOfStack(s) <= max) {
	            count++;
	            } else {
	                break;
	            }
	        }
	    
	System.out.println(count);
	    
	}
	public static int sumOfStack(Stack<Integer> s) {
	    int sum = 0;
	    for (int i = 0; i < s.size(); i++) {
	        sum += s.get(i);
	    }
	    return sum;
	} 
}