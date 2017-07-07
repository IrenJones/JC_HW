package homework20170706;

public class String1 {

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
	}

	public String extraEnd(String str) {
		if (str.length() <= 2) {
			return str + str + str;
		}
		String s = str.substring(str.length() - 2, str.length());
		return s + s + s;
	}

	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return str.substring(0, 2);
		}

	}

	public String firstHalf(String str) {
		if (str.length() > 0) {
			return str.substring(0, str.length() / 2);
		}
		return str;
	}

	public String withoutEnd(String str) {
		if (str.length() == 2) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	public String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}

	public String nonStart(String a, String b) {
		String res = "";
		if (a.length() >= 2) {
			res += a.substring(1, a.length());
		}
		if (b.length() >= 2) {
			res += b.substring(1, b.length());
		}
		return res;
	}

	public String left2(String str) {
		if (str.length() == 2) {
			return str;
		} else {
			return str.substring(2, str.length()) + str.substring(0, 2);
		}
	}

	public String right2(String str) {
		if (str.length() == 2) {
			return str;
		} else {
			return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
		}
	}

	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1, str.length());
		}
	}

	public String withouEnd2(String str) {
		if (str.length() <= 1) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	public String middleTwo(String str) {
		int middle = str.length() / 2;
		return str.substring(middle - 1, middle + 1);
	}

	public boolean endsLy(String str) {
		boolean res = false;
		if (str.length() >= 2) {
			if (str.substring(str.length() - 2, str.length()).equals("ly")) {
				res = true;
			}
		}
		return res;
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	public String twoChar(String str, int index) {
		if (index + 2 > str.length() || index < 0) {
			return str.substring(0, 2);
		} else {
			return str.substring(index, index + 2);
		}
	}

	public String middleThree(String str) {
		int mid = str.length() / 2;
		return str.substring(mid - 1, mid + 2);
	}

	public boolean hasBad(String str) {
		boolean res = false;
		if (str.length() == 3) {
			if (str.equals("bad")) {
				res = true;
			}
		} else if (str.length() > 3) {
			if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
				res = true;
			}
		}
		return res;
	}

	public String atFirst(String str) {
		String res = "";
		int k = 0;
		int mini = Math.min(str.length(), 2);
		for (int i = 0; i < mini; i++, k++) {
			res += str.charAt(i);
		}
		while (k < 2) {
			res += "@";
			k++;
		}
		return res;
	}

	public String lastChars(String a, String b) {
		String res = "";
		if (a.length() == 0) {
			res += "@";
		} else {
			res += a.charAt(0);
		}
		if (b.length() == 0) {
			res += "@";
		} else {
			res += b.charAt(b.length() - 1);
		}
		return res;
	}

	public String conCat(String a, String b) {
		String res = "";
		if (a.length() > 0 && b.length() > 0) {
			if (a.charAt(a.length() - 1) == b.charAt(0)) {
				res += a.substring(0, a.length() - 1) + b;
			} else {
				res += a + b;
			}
		} else {
			res += a + b;
		}
		return res;
	}

	public String lastTwo(String str) {
		String res = "";
		if (str.length() < 2) {
			res += str;
		} else if (str.length() >= 2) {
			if (str.length() > 2) {
				res += str.substring(0, str.length() - 2);
			}
			res += str.charAt(str.length() - 1) + "" + str.charAt(str.length() - 2);
		}
		return res;
	}

	public String seeColor(String str) {
		String res = "";
		if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
			res += "red";
		} else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
			res += "blue";
		}
		return res;
	}

	public boolean frontAgain(String str) {
		boolean res = false;
		if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
			res = true;
		}
		return res;
	}

	public String minCat(String a, String b) {
		String res = "";
		int mini = Math.min(a.length(), b.length());
		if (a.length() != 0) {
			res += a.substring(a.length() - mini, a.length());
		}
		if (b.length() != 0) {
			res += b.substring(b.length() - mini, b.length());
		}
		return res;
	}

	public String extraFront(String str) {
		int size = Math.min(str.length(), 2);
		String res = "";
		if (str.length() >= 1) {
			res += str.substring(0, size) + str.substring(0, size) + str.substring(0, size);
		}
		return res;
	}

	public String without2(String str) {
		String res = "";
		if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
			if (str.length() > 2) {
				res += str.substring(2, str.length());
			}
		} else {
			res += str;
		}
		return res;
	}

	public String deFront(String str) {
		String res = "";
		if (str.length() >= 1 && str.charAt(0) == 'a') {
			res += 'a';
		}
		if (str.length() >= 2 && str.charAt(1) == 'b') {
			res += 'b';
		}
		if (str.length() >= 3) {
			res += str.substring(2, str.length());
		}
		return res;
	}

	public String startWord(String str, String word) {
		String res = "";
		if (word.length() == 1) {
			if (str.length() >= 1) {
				res += str.charAt(0);
			}
		} else {
			if (str.length() >= word.length()) {
				if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
					res += str.substring(0, word.length());
				}
			}
		}
		return res;
	}

	public String withoutX(String str) {
		String res = "";
		boolean flag = true;
		if (str.length() >= 1) {
			if (str.charAt(0) == 'x') {
				res += str.substring(1, str.length());
				flag = false;
			}
			if (str.charAt(str.length() - 1) == 'x') {
				if (!res.equals("")) {
					res = res.substring(0, res.length() - 1);
				} else {
					res = str.substring(0, str.length() - 1);
				}
				flag = false;
			}
			if (flag) {
				res = str;
			}
		}
		return res;
	}

	public String withoutX2(String str) {
		String res = "";
		if (str.length() >= 1 && str.charAt(0) != 'x') {
			res += str.charAt(0);
		}
		if (str.length() >= 2 && str.charAt(1) != 'x') {
			res += str.charAt(1);
		}
		if (str.length() >= 3) {
			res += str.substring(2, str.length());
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("");
	}
}
