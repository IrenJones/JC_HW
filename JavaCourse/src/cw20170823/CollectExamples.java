package cw20170823;

import java.util.HashSet;
import java.util.stream.Stream;

public class CollectExamples {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("b", "a", "n", "a", "n", "a");
		StringBuilder sbmyau = stream.collect(StringBuilder::new, (sb,s) -> sb.append(s), (sb1,sb2)-> sb1.append(sb2));
		System.out.println(sbmyau.toString());
		
		Stream<String> stream2 = Stream.of("b", "a", "n", "a", "n", "a");
		HashSet<String> let = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);
		System.out.println(let);
		System.out.println();
		Stream.of("b", "a", "n", "a", "n", "a").distinct().forEach(System.out::println);
		System.out.println();
		Stream.of("b", "a", "n", "a", "n", "a").filter(s-> s.charAt(0) >'c').forEach(System.out::println);
		System.out.println();
		Stream.of("b", "a", "n", "a", "n", "a").limit(3).forEach(System.out::println);
		
		
		Stream.iterate(1, n->n+1).skip(5).limit(2).forEach(System.out::print);
	}

}
