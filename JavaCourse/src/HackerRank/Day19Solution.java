package HackerRank;

import java.util.Scanner;

interface AdvancedArithmetic {

	int divisorSum(int n);

}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int result = 1;
		if (n != 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					result += i;
				}
			}
		}
		return result;
	}

}

public class Day19Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		AdvancedArithmetic myCalculator = new Calculator();

		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
