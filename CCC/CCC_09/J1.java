import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[]args) throws IOException{
      Scanner in = new Scanner(System.in);
      
      int a = in.nextInt();
      int b = in.nextInt() * 3;
      int c = in.nextInt();
      
      
      System.out.println("The 1-3-sum is " + (91 + a + b + c));
  }
}