package cw20170823;

import java.util.Optional;
import java.util.Random;

public class OptionalExamples {

	static  Random r = new Random();
	
	public static void main(String[] args) {
		
		Optional<String> opt = compute();
		//System.out.println(opt.get());
		System.out.println(opt.orElse("Hetalia"));
		System.out.println(opt.orElse(""));
		System.out.println(opt.orElseGet(()->""));
		
		
		System.out.println(opt.orElseGet(OptionalExamples::getDefaultValue));

	}
	
	public static Optional<String> compute(){
		
		return Optional.ofNullable(r.nextBoolean()? "hello":null);
	}
	
	static String getDefaultValue(){
		return "";
	}

}
