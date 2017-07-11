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
				} else if (word.length()>0){
					notCount++;
				}
			}
			c = 0;
			flag = false;
			word="";
		}
		return notCount == isCount ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(equalIsNot("This is notnot"));
	}

}
