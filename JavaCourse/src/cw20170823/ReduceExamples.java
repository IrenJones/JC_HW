package cw20170823;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExamples {

	public static void main(String[] args) {
		
		Stream<String> letters = Stream.of("b", "a", "n", "a", "n", "a");
		Optional<String> reduced = letters.reduce((c1,c2) -> c1+c2);
		reduced.ifPresent(System.out::println);
		
		Optional<Integer> sum = Stream.of(0,1,2,3,4,5,6,7,8,9).reduce((i,j)->i+j);
		sum.ifPresent(System.out::println);
		
		Integer opti = Stream.of(1,2,3,4,5,6,7,8,9).reduce(8,(i,j)->i*j);
		System.out.println(opti);
	}

}
