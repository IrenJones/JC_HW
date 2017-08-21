package cw20170821;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<String, Integer> f1 = s-> s.length();
		Function<String, Integer> f2 = String::length;
		
		System.out.println(f1.apply("hetalia"));
		
		BiFunction<String, String, String> bf1 = (s1, s2) -> s1.concat(s2); 
		BiFunction<String, String, String> bf2 = String::concat; 
		
		BinaryOperator<String> bo1 = String::concat;
		String result = bo1.apply("Belarus ", "Russia");
		System.out.println(result);
		
		UnaryOperator<String> uo1 = (s) ->s.toUpperCase();
		
		UnaryOperator<String> uo2 = String :: toUpperCase;

	}

}
