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
	
	public static void main(String[] args) {
	}

}
