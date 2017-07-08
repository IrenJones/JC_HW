package homework20170707;

import cw20170624.SimpleUnit;

public class StringMethodsPractice {

	public static void main(String[] args) {

		String s = "   Hello ";
		String s2 = "Hello"; // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		// ^1 ^2
		String s6 = "";

		System.out.println(SimpleUnit.assertEquals(trim(s6), ""));
		System.out.println(SimpleUnit.assertEquals(trim(s2), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s4), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s3), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s5), "He l l o"));

	}

	private static String trim(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		if (hasNoTrailingOrLeadingSpaces(s)) {
			return s;
		}

		int iterFirst = -1;
		int iterLast = -1;
		for(int i=0;i<s.length();i++){
			if (s.charAt(i) > ' ' && iterFirst == -1){
				iterFirst = i;
				break;
			}
		}

		for(int i= s.length()-1;i>0;i--){
			if (s.charAt(i) > ' ' && iterLast == -1){
				iterLast = i;
				break;
			}
		}

		return s.substring(iterFirst, iterLast+1);
	}

	private static boolean hasNoTrailingOrLeadingSpaces(String s) {
		return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
	}
}
