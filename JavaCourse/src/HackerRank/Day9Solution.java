package HackerRank;

import java.util.Scanner;

public class Day9Solution {
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		System.out.println(result);
		in.close();
	}
}
