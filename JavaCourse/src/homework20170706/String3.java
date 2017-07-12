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

	public int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}

	public static String sameEnds(String string) {
		String s = "";
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.substring(0, i + 1).equals(string.substring(string.length() - i - 1, string.length()))) {
				s = string.substring(0, i + 1);
			}
		}
		return s;
	}

	public String mirrorEnds(String string) {
		String s = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(0, i + 1)
					.equals(new StringBuilder(string.substring(string.length() - i - 1, string.length())).reverse()
							.toString())) {
				s = string.substring(0, i + 1);
			}
		}
		return s;
	}

	public static int maxBlock(String str) {
		int len = 0;
		char s;
		int c = 0;
		int j;
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			for (j = i; j < str.length(); j++) {
				if (str.charAt(j) == s) {
					c++;
				} else {
					if (len < c) {
						len = c;
					}
					c = 0;
					break;
				}
			}
			if (j == str.length()) {
				if (len < c) {
					len = c;
				}
				c = 0;
			}
		}
		return len;
	}

	public static int sumNumbers(String str) {
		int sum = 0;
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				s += str.charAt(i);
			} else {
				if (s.length() > 0) {
					sum += Integer.parseInt(s);
					s = "";
				}
			}
		}
		if (s.length() > 0) {
			sum += Integer.parseInt(s);
		}
		return sum;
	}

	public static String withoutString(String base, String remove) {
		String res="";
		int i;
		for(i=0;i<base.length()-remove.length()+1;i++){
			if(base.substring(i, i+remove.length()).toLowerCase().equals(remove.toLowerCase())){
				i+= remove.length()-1;
			}
			else{
				res+=base.charAt(i);
			}
		}
		while (i<base.length()){
			res+=base.charAt(i);
			i++;
		}
		return res;
	}
	
	
	public static String notReplace(String str) {
		//FIXME
		String res = "";
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'i') {
				if (str.charAt(i + 1) == 's') {
					if (((i - 1 >= 0 && !Character.isLetter(str.charAt(i - 1))) || (i == 0))
							&& ( (i + 2 < str.length() && !Character.isLetter(str.charAt(i + 2)))
									|| (i == str.length() - 2))) {
						res += "is not";
						i += 1;
					}
					else{
						res += str.charAt(i);
					}
				}
				else{
					res += str.charAt(i);
				}
			} else {
				res += str.charAt(i);
			}
		}
		while (i < str.length()) {
			res += str.charAt(i);
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		// System.out.println(equalIsNot("This is notnot"));
		// System.out.println(gHappy("gg"));
		// System.out.println(sameEnds("abXYab"));
		// System.out.println(maxBlock("xyzz"));
		System.out.println(notReplace("Dis is bliss is"));
	}

}
