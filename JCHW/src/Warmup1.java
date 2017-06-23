public class Warmup1 {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation)
			return true;
		else
			return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == bSmile)
			return true;
		else
			return false;
	}

	public int sumDouble(int a, int b) {
		if (a != b)
			return a + b;
		else
			return 4 * a;
	}

	public int diff21(int n) {
		if (n < 21)
			return 21 - n;
		else
			return 2 * (n - 21);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if ((talking && (hour < 7)) || (talking && (hour > 20)))
			return true;
		else
			return false;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || (a + b) == 10)
			return true;
		else
			return false;
	}

	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10)
			return true;
		else
			return false;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			if (a * b > 0 && a < 0)
				return true;
			else
				return false;
		} else {
			if (a * b < 0)
				return true;
			else
				return false;
		}
	}

	public String notString(String str) {
		if (str.length() >= 3) {
			String first = str.substring(0, 3);
			if (first.equals("not"))
				return str;
		}
		return "not " + str;
	}

	public String missingChar(String str, int n) {
		if (n == 0) {
			return str.substring(1, str.length());
		} else if (n == str.length() - 1) {
			return str.substring(0, str.length() - 1);
		} else {
			return str.substring(0, n) + str.substring(n + 1, str.length());
		}
	}

	public String frontBack(String str) {
		if (str.length() < 2)
			return str;
		else
			return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1)
					+ str.substring(0, 1);
	}

	public String front3(String str) {
		if (str.length() > 3) {
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		} else
			return str + str + str;

	}

	public String backAround(String str) {
		return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
	}

	public boolean or35(int n) {
		if (n % 5 == 0 || n % 3 == 0)
			return true;
		else
			return false;
	}

	public String front22(String str) {
		String str_front;
		if (str.length() > 2)
			str_front = str.substring(0, 2);
		else
			str_front = str;
		return str_front + str + str_front;
	}

	public boolean startHi(String str) {
		if (str.length() < 2)
			return false;
		else {
			if (str.substring(0, 2).equals("hi"))
				return true;
			else
				return false;
		}
	}

	public boolean icyHot(int temp1, int temp2) {
		if (temp1 * temp2 < -100)
			return true;
		else
			return false;
	}

	public boolean in1020(int a, int b) {
		if (a <= 20 && a >= 10 || b <= 20 && b >= 10)
			return true;
		else
			return false;
	}

	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
			return true;
		else
			return false;
	}

	public boolean loneTeen(int a, int b) {
		int res1 = (a >= 13 && a <= 19 ? 1 : 0);
		int res2 = (b >= 13 && b <= 19 ? 1 : 0);
		if ((res1 + res2) % 2 == 0)
			return false;
		else
			return true;
	}

	public String delDel(String str) {
		if (str.length() >= 4) {
			if (str.substring(1, 4).equals("del"))
				return str.charAt(0) + str.substring(4, str.length());
			else
				return str;
		} else
			return str;
	}

	public boolean mixStart(String str) {
		if (str.length() >= 3) {
			String subs = str.substring(0, 3);
			if (subs.substring(1, 3).equals("ix"))
				return true;
		}
		return false;
	}

	public String startOz(String str) {
		String res = "";
		if (str.length() >= 1 && str.charAt(0) == 'o')
			res += "o";
		if (str.length() >= 2 && str.charAt(1) == 'z')
			res += "z";
		return res;
	}

	public int intMax(int a, int b, int c) {
		int maxi = (a > b ? a : b);
		return (maxi > c ? maxi : c);
	}

	public int close10(int a, int b) {
		if (Math.abs(10 - a) > Math.abs(10 - b))
			return b;
		else if (Math.abs(10 - a) < Math.abs(10 - b))
			return a;
		else
			return 0;
	}

	public boolean in3050(int a, int b) {
		if (a >= 30 && a <= 40 && b >= 30 && b <= 40)
			return true;
		if (a >= 40 && a <= 50 && b >= 40 && b <= 50)
			return true;
		return false;
	}

	public int max1020(int a, int b) {
		int maxi_f = 0;
		int maxi_s = 0;
		if (a >= 10 && a <= 20)
			maxi_f = a;
		if (b >= 10 && b <= 20)
			maxi_s = b;
		return (maxi_f > maxi_s ? maxi_f : maxi_s);
	}

	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				count++;
		}
		if (count >= 1 && count <= 3)
			return true;
		else
			return false;
	}

	public boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10)
			return true;
		return false;
	}

	public String endUp(String str) {
		if (str.length() < 3)
			return str.toUpperCase();
		String last = str.substring(str.length() - 3, str.length());
		return str.substring(0, str.length() - 3) + last.toUpperCase();
	}

	public String everyNth(String str, int n) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % n == 0)
				res += str.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println("Hello from Belarus");
	}
}
