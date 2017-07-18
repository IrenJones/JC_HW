package HackerRank;

import java.util.Scanner;

public class Day6Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for (int j = 0; j < n; j++) {
			String str = s.nextLine();
			char [] arr = str.toCharArray();
			StringBuilder s1 = new StringBuilder();
			StringBuilder s2 = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				if (i%2 == 0){
					s1.append(arr[i]);
				}
				else{
					s2.append(arr[i]);
				}
			}
			System.out.println(s1.toString() + " " + s2.toString());
		}
		s.close();
	}
}
