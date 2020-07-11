package CCO;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Snowflakes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream in = new DataInputStream(System.in);
		int snow = Integer.parseInt(in.readLine());
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < snow; i++) {
			StringTokenizer s = new StringTokenizer(in.readLine());
			ArrayList<Integer> temp = new ArrayList(6);
			temp.add(Integer.parseInt(s.nextToken()));
			temp.add(Integer.parseInt(s.nextToken()));
			temp.add(Integer.parseInt(s.nextToken()));
			temp.add(Integer.parseInt(s.nextToken()));
			temp.add(Integer.parseInt(s.nextToken()));
			temp.add(Integer.parseInt(s.nextToken()));
			Collections.sort(temp);
			if (arr.indexOf(temp) != -1) {
				System.out.println("Twin snowflakes found.");
				return;
			}
			arr.add(temp);
		}
		in.close();
		System.out.println("No two snowflakes are alike.");
	}

	
}