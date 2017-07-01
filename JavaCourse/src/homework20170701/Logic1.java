package homework20170701;

import java.util.ArrayList;

public class Logic1 {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40) {
			if (cigars <= 60 && isWeekend == false) {
				return true;
			} else if (isWeekend == true) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		} else if (you >= 8 || date >= 8) {
			return 2;
		} else {
			return 1;
		}
	}
	

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp >= 60 && temp <= 100) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temp >= 60 && temp <= 90) {
				return true;
			} else {
				return false;
			}
		}
	}
	

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int param = 1;
		if (isBirthday) {
			param = 5;
		}
		if (speed <= (60 + param)) {
			return 0;
		} else if ((speed >= 61 + param) && (speed <= 80 + param)) {
			return 1;
		} else {
			return 2;
		}
	}
	

	public int sortaSum(int a, int b) {
		if ((a + b) <= 19 && (a + b) >= 10) {
			return 20;
		} else {
			return a + b;
		}
	}
	

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day <= 5 && day > 0) {
				return "10:00";
			} else {
				return "off";
			}
		} else {
			if (day <= 5 && day > 0) {
				return "7:00";
			} else {
				return "10:00";
			}
		}
	}
	

	public boolean love6(int a, int b) {
		if (a == 6 || b == 6) {
			return true;
		} else if (Math.abs(a - b) == 6) {
			return true;
		} else if ((a + b) == 6) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean in1To10(int n, boolean outsideMode) {
		boolean result = false;
		if (outsideMode) {
			if (n <= 1 || n >= 10) {
				result = true;
			}
		} else {
			if (n >= 1 && n <= 10) {
				result = true;
			}
		}
		return result;
	}
	

	public boolean specialEleven(int n) {
		boolean result = false;
		if (n % 11 == 0 || (n - 1) % 11 == 0) {
			result = true;
		}
		return result;
	}
	

	public boolean more20(int n) {
		boolean result = false;
		if (n % 20 == 1 || n % 20 == 2) {
			result = true;
		}
		return result;
	}
	

	public boolean old35(int n) {
		boolean result = false;
		if (n % 3 == 0 ^ n % 5 == 0) {
			result = true;
		}
		return result;
	}
	

	public boolean less20(int n) {
		boolean result = false;
		if (n % 20 == 19 || n % 20 == 18) {
			result = true;
		}
		return result;
	}
	

	public boolean nearTen(int num) {
		boolean result = false;
		if (num % 10 <= 2 || num % 10 >= 8) {
			result = true;
		}
		return result;
	}
	

	public int teenSum(int a, int b) {
		int result = a + b;
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			result = 19;
		}
		return result;
	}
	

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		boolean result = false;

		if (isMorning && isMom && !isAsleep) {
			result = true;
		}
		if (!isAsleep && !isMorning) {
			result = true;
		}
		return result;
	}
	

	public int teaParty(int tea, int candy) {
		int result = 1;

		if (tea < 5 || candy < 5) {
			result = 0;
		} else if (tea / candy >= 2 || candy / tea >= 2) {
			result = 2;
		}

		return result;
	}
	

	public String fizzString(String str) {
		String result = "";
		if (str.length() == 1) {
			if (str.charAt(0) == 'f') {
				result += "Fizz";
			} else if (str.charAt(0) == 'b') {
				result += "Buzz";
			} else {
				result += str;
			}
		} else if (str.length() > 1) {
			if (str.charAt(0) == 'f') {
				result += "Fizz";
			}
			if (str.charAt(str.length() - 1) == 'b') {
				result += "Buzz";
			} else if (str.charAt(0) != 'f') {
				result += str;
			}
		}
		return result;
	}
	

	public String fizzString2(int n) {
		String res = "";
		if (n % 3 == 0) {
			res += "Fizz";
		}
		;
		if (n % 5 == 0) {
			res += "Buzz";
		}
		if ("".equals(res)) {
			res += n;
		}
		return res + "!";
	}
	

	public boolean twoAsOne(int a, int b, int c) {
		boolean res = false;

		if (a + b == c) {
			res = true;
		} else if (b + c == a) {
			res = true;
		} else if (c + a == b) {
			res = true;
		}
		return res;
	}
	

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		boolean res = false;
		if (bOk && c > b) {
			res = true;
		} else if (b > a && c > b) {
			res = true;
		}
		return res;
	}
	

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean res = false;
		if (equalOk) {
			if (b >= a && c >= b) {
				res = true;
			}
		} else {
			if (b > a && c > b) {
				res = true;
			}
		}
		return res;
	}
	

	public boolean lastDigit(int a, int b, int c) {
		boolean result = false;
		if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
			result = true;
		}
		return result;
	}
	

	public boolean lessBy10(int a, int b, int c) {
		boolean res = false;
		if (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10) {
			res = true;
		}
		return res;
	}
	

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		int res = die1 + die2;
		if (noDoubles && (die1 == die2)) {
			if (die1 != 6) {
				res = res + 1;
			} else {
				res = die1 + 1;
			}
		}
		return res;
	}
	

	public int maxMod5(int a, int b) {
		int res = a;
		if (res == b) {
			res = 0;
		} else if (a % 5 == b % 5) {
			res = res > b ? b : res;
		} else {
			res = res > b ? res : b;
		}
		return res;
	}
	

	public int redTicket(int a, int b, int c) {
		int result = 0;
		if (a == b && b == c && c == 2) {
			result = 10;
		} else if (a == b && b == c) {
			result = 5;
		} else if (a != b && a != c) {
			result = 1;
		}
		return result;
	}
	

	public int greenTicket(int a, int b, int c) {
		int res;
		if (a != b && b != c && c != a) {
			res = 0;
		} else if (a == b && b == c) {
			res = 20;
		} else {
			res = 10;
		}
		return res;
	}
	

	public int blueTicket(int a, int b, int c) {
		int res = 0;
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		if (ab == 10 || bc == 10 || ac == 10) {
			res = 10;
		} else if (ab - bc >= 10 || ab - ac >= 10) {
			res = 5;
		}
		return res;
	}
	

	public static boolean shareDigit(int a, int b) {
		boolean result = false;
		ArrayList<Integer> aArr = new ArrayList<Integer>();
		if (a == 0) {
			aArr.add(a);
		} else {
			while (a > 0) {
				aArr.add(a % 10);
				a = a / 10;
			}
		}

		ArrayList<Integer> bArr = new ArrayList<Integer>();
		if (b == 0) {
			bArr.add(b);
		} else {
			while (b > 0) {
				bArr.add(b % 10);
				b = b / 10;
			}
		}
		for (int j = 0; j < bArr.size(); j++) {
			if (aArr.contains(bArr.get(j))) {
				result = true;
				break;
			}
		}

		return result;
	}
	

	public int sumLimit(int a, int b) {
		int res = a + b;
		if (String.valueOf(res).length() > String.valueOf(a).length()) {
			res = a;
		}
		return res;
	}
	

	public static void main(String[] args) {
		System.out.println(shareDigit(12, 245));

	}
}
