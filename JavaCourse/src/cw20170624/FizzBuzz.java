package cw20170624;

public class FizzBuzz {
	public static String fizzBuzz(int n){
		String res = "";
		if (n%3 == 0)
			res+="Fizz";
		if (n%5 == 0)
			res+="Buzz";
		if ("".equals(res))
			res+=Integer.toString(n);
		return res;
	}
}
