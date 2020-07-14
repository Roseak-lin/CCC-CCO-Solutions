import java.io.*;
import java.util.*;

public class J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int l = in.nextInt();
        int t = 0;
        for (int i = b; i <= l; i++) {
            int num = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            if (num == 4) t++;
        }
        System.out.println("The number of RSA numbers between " + b + " and " + l + " is " + t );
    }
}