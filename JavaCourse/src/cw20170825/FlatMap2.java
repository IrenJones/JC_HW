package cw20170825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap2 {

	public static void main(String[] args) {
		
		
		List<String> empty = Arrays.asList();
		
		List<String> list1 = Arrays.asList("one", "two", "three");
		
		List<String> list2 = Arrays.asList("один", "два", "три");
		
		Stream<List<String>> streamOfLists = Stream.of(empty, list1, list2);
		Stream<String> tog1 = streamOfLists.flatMap(l -> l.stream());
		
		List<String> lend = tog1.collect(Collectors.toList());
		System.out.println(lend);
	}

}
