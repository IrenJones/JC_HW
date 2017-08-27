package cw20170825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		
		String[] words = {"hello", "world"};
		
		Stream<String> stream = Arrays.stream(words);
		
		Stream<String[]> sA = stream.map(s -> s.split(""));
		
		//Stream<Stream<String>> sss = sA.map(s -> Arrays.stream(s));
		
		Stream<String> sss = sA.flatMap(s -> Arrays.stream(s));
		List <String> cl = sss.distinct().collect(Collectors.toList());
		System.out.println(cl);
	}

}
