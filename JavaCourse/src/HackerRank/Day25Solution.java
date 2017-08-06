package HackerRank;

import java.util.Scanner;

public class Day25Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		for (int j = 0; j < k; j++) {
			int n = in.nextInt();
			boolean res = true;
			if (n == 0 || n == 1) {
				res = false;
			}
			if (n >= 4) {
				for (int i = 2; i * i <= n; i++) {
					if (n % i == 0) {
						res = false;
						break;
					}
				}
			}
			System.out.println(res ? "Prime" : "Not prime");
		}
		in.close();
	}
}
