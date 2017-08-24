package cw20170823;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExamples {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.empty();
		Stream<Integer> stream2 = Stream.of(1);
		Stream<Integer> stream3 = Stream.of(13, 14, 1, 5, 20, 18);
		
		List<String> list = Arrays.asList("one", "two", "three");
		Stream<String> stream4 = list.stream();
		
		
		Stream<Double> random  = Stream.generate(Math::random);
		
		
		count(stream);
		count(stream2);
		count(stream3);
		count(stream4);
		random.limit(13).forEach(System.out::println);
		
		
		//Optional<String> any = Stream.<String>empty().findAny();
		
		boolean any = Stream.of(1,2,3,4,5,6,7).anyMatch(i->i%3 == 0);
		
		Stream<Integer> filtered = Stream.of(0,1,2,3,4,5,7).filter(i->i%3 == 0);
		filtered.forEach(System.out::println);
	}

	private static void count(Stream<?> stream) {
		long count = stream.count();
		System.out.println(count);
	}

}
