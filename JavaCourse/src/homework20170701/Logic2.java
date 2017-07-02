package homework20170701;

import java.util.ArrayList;
import java.util.Arrays;

public class Logic2 {
	public boolean makeBricks(int small, int big, int goal) {
		boolean res = false;
		int smallSize = 1;
		int bigSize = 5;
		int numberBig = goal / (bigSize);
		int r = goal - bigSize * numberBig;
		if (numberBig <= big) {
			if (r != 0) {
				if (r <= small * smallSize) {
					res = true;
				}
			} else {
				res = true;
			}
		} else if (goal - bigSize * big <= small * smallSize) {
			res = true;
		}
		return res;
	}

	public int loneSum(int a, int b, int c) {
		int res = 0;
		if (a != b && b != c && c != a) {
			res = a + b + c;
		} else if (a == b && a != c) {
			res = c;
		} else if (b == c && a != c) {
			res = a;
		} else if (a == c && a != b) {
			res = b;
		}
		return res;
	}

	public int luckySum(int a, int b, int c) {
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 13) {
				break;
			} else {
				sum += arr.get(i);
			}
		}
		return sum;
	}

	public int noTeenSum(int a, int b, int c) {
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(a);
		arr.add(b);
		arr.add(c);

		for (int i = 0; i < arr.size(); i++) {
			int element = arr.get(i);
			if (element < 13 || element > 19 || element == 15 || element == 16) {
				sum += element;
			}
		}
		return sum;
	}

	public int roundSum(int a, int b, int c) {
		int sum = round10(a) + round10(b) + round10(c);
		return sum;
	}

	public int round10(int num) {
		if (num % 10 < 5) {
			num -= num % 10;
		} else {
			num = num - num % 10 + 10;
		}
		return num;
	}

	public boolean closeFar(int a, int b, int c) {
		boolean res = false;
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2
				|| Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
			res = true;
		}
		return res;
	}

	public int blackjack(int a, int b) {
		int res = 0;

		if (a > b) {
			if (a <= 21) {
				res = a;
			} else if (b <= 21) {
				res = b;
			}
		} else {
			if (b <= 21) {
				res = b;
			} else if (a <= 21) {
				res = a;
			}
		}
		return res;
	}

	public boolean evenlySpaced(int a, int b, int c) {
		boolean res = false;
		int[] arr = { a, b, c };
		Arrays.sort(arr);
		if (Math.abs(arr[0] - arr[1]) == Math.abs(arr[1] - arr[2])) {
			res = true;
		}
		return res;
	}

	public int makeChocolate(int small, int big, int goal) {
		int res = -1;
		int kiloSmall = 1;
		int kiloBig = 5;
		int numberBig = goal / (kiloBig);
		int r = goal - kiloBig * numberBig;
		if (numberBig <= big) {
			if (r != 0) {
				if (r <= small * kiloSmall) {
					res = r;
				}
			} else {
				res = 0;
			}
		} else if (goal - kiloBig * big <= small * kiloSmall) {
			res = (goal - kiloBig * big) / kiloSmall;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Logic2!");
	}
}
