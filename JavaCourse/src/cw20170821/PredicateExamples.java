package cw20170821;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		// check - string is empty or not
		Predicate<String> p2 = String :: isEmpty;
		
		Predicate<String> p1 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> bp1 = (line, prefix)-> line.startsWith(prefix);
		BiPredicate<String, String> bp2 = String::startsWith;
	}

}
