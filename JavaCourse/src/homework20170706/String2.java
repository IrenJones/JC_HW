package homework20170706;

public class String2 {
	public String doubleChar(String str) {
		StringBuilder sb = new StringBuilder();
		if (str.length() > 0) {
			sb.append(str.charAt(0)).append(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {
				sb.append(str.charAt(i)).append(str.charAt(i));
			}
		}

		return sb.toString();
	}

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'h' && i + 1 < str.length() && str.charAt(i + 1) == 'i') {
				count++;
				i++;
			}
		}
		return count;
	}

	public boolean catDog(String str) {
		int cc = 0;
		int cd = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				cc++;
				i += 2;
			} else if (str.substring(i, i + 3).equals("dog")) {
				cd++;
				i += 2;
			}
		}
		return cc == cd ? true : false;
	}

	public int countCode(String str) {
		int cc = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				cc++;
				i += 3;
			}
		}
		return cc;
	}

	public boolean endOther(String a, String b) {
		boolean res = false;
		String mini = "";
		if (a.length() < b.length()) {
			mini = a;
			a = b;
			b = mini;
		}
		if (b.length() > 0) {
			if (a.substring(a.length() - b.length(), a.length()).toLowerCase().equals(b.toLowerCase())) {
				res = true;
			}
		}
		return res;
	}

	public boolean xyzThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz") && (i == 0 || str.charAt(i - 1) != '.')) {
				return true;
			}
		}
		return false;
	}

	public boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	public boolean xyBalance(String str) {
		boolean res = true;
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (flag && str.charAt(i) == 'y') {
				res = true;
				flag = false;
			}
			if (str.charAt(i) == 'x') {
				flag = true;
				res = false;
			}
		}
		return res;
	}

	public String mixString(String a, String b) {
		StringBuilder res = new StringBuilder();
		int i, j;
		for (i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
			res.append(a.charAt(i));
			res.append(b.charAt(i));
		}
		while (i < a.length()) {
			res.append(a.charAt(i));
			i++;
		}
		while (j < b.length()) {
			res.append(b.charAt(j));
			j++;
		}
		return res.toString();
	}

	public String repeatEnd(String str, int n) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res += str.substring(str.length() - n, str.length());
		}
		return res;
	}

	public String repeatFront(String str, int n) {
		String res = "";
		for (int i = n; i > 0; i--) {
			res += str.substring(0, i);
		}
		return res;
	}

	public String repeatSeparator(String word, String sep, int count) {
		String res = "";
		for (int i = 0; i < count; i++) {
			res += word;
			if (i < count - 1) {
				res += sep;
			}
		}
		return res;
	}

	public boolean prefixAgain(String str, int n) {
		String tmp = str.substring(0, n);
		for (int i = n; i < str.length() - n + 1; i++) {
			if (str.substring(i, i + n).equals(tmp)) {
				return true;
			}
		}
		return false;
	}

	public boolean xyzMiddle(String str) {
		int countl = 0;
		int countr = str.length() - 3 - countl;
		if (str.equals("xyz")) {
			return true;
		}
		if (str.length() == 4 && (str.substring(0, 3).equals("xyz") || str.substring(1, 4).equals("xyz"))) {
			return true;
		}
		if (str.length() > 3) {
			for (int i = 0; i < str.length(); i++) {
				countl++;
				countr--;
				if (Math.abs(countl - countr) <= 1 && str.substring(i + 1, i + 4).equals("xyz")) {
					return true;
				}
			}
		}
		return false;
	}

	public String getSandwich(String str) {
		int f = 0;
		int l = 0;
		boolean ff = false;
		for (int i = 0; i < str.length() - 4; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				if (ff == false) {
					ff = true;
					f = i + 5;
				} else {
					l = i;
				}
			}
		}
		if (f > l) {
			f = 0;
			l = 0;
		}
		return str.substring(f, l);
	}

	public boolean sameStarChar(String str) {
		boolean res = true;
		for (int i = 0; i < str.length(); i++) {
			if (i >= 1 && i <= str.length() - 2 && str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				res = false;
			}
		}
		return res;
	}

	public String oneTwo(String str) {
		StringBuilder s = new StringBuilder();
		int k = 0;
		for (int i = 0; i < str.length() - 2; i += 3) {
			s.append(str.charAt(i + 1)).append(str.charAt(i + 2)).append(str.charAt(i));
		}
		return s.toString();
	}

	public String zipZap(String str) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z' && i + 2 < str.length() && str.charAt(i + 2) == 'p') {
				s.append(str.charAt(i)).append(str.charAt(i + 2));
				i += 2;
			} else {
				s.append(str.charAt(i));
			}
		}
		return s.toString();
	}

	public String plusOut(String str, String word) {
		String s = "";
		int i;
		for (i = 0; i < str.length() - word.length() + 1; i++) {
			if (!str.substring(i, i + word.length()).equals(word)) {
				s += '+';
			} else {
				s += word;
				i += word.length() - 1;
			}
		}
		while (i < str.length()) {
			s += '+';
			i++;
		}
		return s;
	}

	public static void main(String[] args) {
	}
}
