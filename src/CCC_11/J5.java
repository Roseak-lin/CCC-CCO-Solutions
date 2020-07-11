package CCC_11;

import java.io.*;
import java.util.*;

public class J5 {
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream(System.in);
        int n = Integer.parseInt(in.readLine());
        int arr[] = {1, 1, 1, 1, 1, 1, 1};
        for (int i = 1; i < n; i++) {
            int temp = Integer.parseInt(in.readLine());
            arr[temp] *= (1 + arr[i]);
        }
        System.out.println(arr[n]);
    }
}