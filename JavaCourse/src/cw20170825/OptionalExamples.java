package cw20170825;

import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {
		
		System.out.println(hasThreeDigits(null));
		System.out.println(hasThreeDigits(99));
		System.out.println(hasThreeDigits(100));
		
		System.out.println(hasThreeDigitsOpt(null));
		System.out.println(hasThreeDigitsOpt(99));
		System.out.println(hasThreeDigitsOpt(100));

	}

	static public boolean hasThreeDigits(Integer i){
		if (i!=null){
			String s = Integer.toString(i);
			return s.length()==3? true:false;
		}
		
		return false;
	}
	
	static public boolean hasThreeDigitsOpt(Integer i){
		return Optional.ofNullable(i).map(n -> Integer.toString(n)).filter(n -> n.length() == 3).isPresent();
		
	}
}
