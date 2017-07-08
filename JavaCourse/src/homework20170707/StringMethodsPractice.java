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
		
		
		System.out.println(SimpleUnit.assertEquals(replace(s2,'e','o'), "Hollo"));
		System.out.println(SimpleUnit.assertEquals(replace(s2,'l','y'), "Heyyo"));
		System.out.println(SimpleUnit.assertEquals(replace(s2,'j','y'), "Hello"));

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
	
	private static String replace(String s, char olds, char news) {

		if (s == null || s.length() == 0) {
			return s;
		}
		char[] chars = s.toCharArray();
		for(int i=0;i<chars.length;i++){
			if (chars[i]==olds){
				chars[i]=news;
			}
		}
		
		return String.valueOf(chars);
	}
}
