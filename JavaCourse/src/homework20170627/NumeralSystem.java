package homework20170627;

public class NumeralSystem {

	static String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String toString(int n, int base) {
		if (base < 2 || base > 36) {
			return "error base";
		}
		String res = "";
		int d = n % base;
		n = n / base;
		while (n > 0) {
			res += DIGITS.charAt(d);
			d = n % base;
			n = n / base;
		}
		res += DIGITS.charAt(d);
		String r = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			r += res.charAt(i);
		}
		return r;
	}
	
	public static String toBinaryString(int n){
		String res = "";
		int d = n % 2;
		n = n / 2;
		while (n > 0) {
			res += DIGITS.charAt(d);
			d = n % 2;
			n = n / 2;
		}
		res += DIGITS.charAt(d);
		String r = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			r += res.charAt(i);
		}
		return r;
	}
	
	public static String toHexString(int n){
		String res = "";
		int d = n % 16;
		n = n / 16;
		while (n > 0) {
			res += DIGITS.charAt(d);
			d = n % 16;
			n = n / 16;
		}
		res += DIGITS.charAt(d);
		String r = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			r += res.charAt(i);
		}
		return r;
	}
	
	public static String toOctalString(int n){
		String res = "";
		int d = n % 8;
		n = n / 8;
		while (n > 0) {
			res += DIGITS.charAt(d);
			d = n % 8;
			n = n / 8;
		}
		res += DIGITS.charAt(d);
		String r = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			r += res.charAt(i);
		}
		return r;
	}

}
