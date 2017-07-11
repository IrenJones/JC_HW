package homework20170706;

public class String3 {

	public int countYZ(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				if (i - 1 >= 0 && (str.toLowerCase().charAt(i - 1) == 'y' || str.toLowerCase().charAt(i - 1) == 'z')) {
					count++;
				}
			} else if (i == str.length() - 1) {
				if (i - 1 >= 0 && (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z')) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean equalIsNot(String str) {
		int isCount = 0;
		int notCount = 0;
		boolean flag = false;
		String word = "";
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'n') {
				word = "not";
			} else if (str.charAt(i) == 'i') {
				word = "is";
				flag = true;
			}
			for (int j = 0; j < word.length() && i + j < str.length(); j++) {
				if (str.charAt(i + j) == word.charAt(j)) {
					c++;
				}
			}
			if (c == word.length()) {
				if (flag) {
					isCount++;
				} else if (word.length() > 0) {
					notCount++;
				}
			}
			c = 0;
			flag = false;
			word = "";
		}
		return notCount == isCount ? true : false;
	}

	public static boolean gHappy(String str) {
		boolean res = true;
		int c = 0;
		if (str.length() == 1 && str.charAt(0) == 'g') {
			return false;
		} else if (str.length() == 2) {
			if (!(str.charAt(0) == 'g' && str.charAt(1) == 'g')) {
				res = false;
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'g') {
					for (int j = i - 1; j < i + 2 && j >= 0 && j < str.length(); j++) {
						if (str.charAt(j) == 'g') {
							c++;
						}
					}
					if (c < 2) {
						res = false;
						break;
					}
					c = 0;
				}
			}
		}
		return res;
	}

	public int countTriple(String str) {
		int count = 0;
		char s;
		int c = 0;
		if (str.length() >= 3) {
			for (int i = 0; i < str.length(); i++) {
				s = str.charAt(i);
				for (int j = i; j < i + 3 && j < str.length(); j++) {
					if (str.charAt(j) == s) {
						c++;
					}
				}
				if (c == 3) {
					count++;
				}
				c = 0;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// System.out.println(equalIsNot("This is notnot"));
		System.out.println(gHappy("gg"));
	}

}
