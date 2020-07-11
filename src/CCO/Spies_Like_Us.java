package CCO;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Spies_Like_Us {
	static ArrayList<Integer> arr[], arr1[];

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		StringTokenizer s = new StringTokenizer(in.readLine());
		int t1 = Integer.parseInt(s.nextToken()), t2 = Integer.parseInt(s.nextToken());
		int k = Integer.parseInt(in.readLine());
		arr = new ArrayList[t1 + 1];
		arr1 = new ArrayList[t2 + 1];
		for (int i = 1; i <= t1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= t2; i++) {
			arr1[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < k; i++) {
			s = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(s.nextToken()), b = Integer.parseInt(s.nextToken());
			arr[a].add(b);
			arr1[b].add(a);
		}
		for (int i = 1; i <= t1; i++) {
		    HashSet<Integer> set = new HashSet<Integer>();
			for (int j : arr[i]) {
				
				if (arr1[j].size() > 1) {
					for (int x : arr1[j]) {
						if (set.contains(x) && x != i) {
							System.out.println("NO");
							System.exit(0);
						}
						set.add(x);
					}
				}
			}
		}
//		for (int i = 1; i <= t1; i++) {
//			System.out.println(set[i]);
//		}
		System.out.println("YES");
	}

}