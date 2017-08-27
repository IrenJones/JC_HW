package cw20170825;

import java.util.stream.IntStream;

public class PrimitiveStreamsExample {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1,10).forEach(System.out::println);
		
		System.out.println(IntStream.rangeClosed(1,10).sum());
		System.out.println(IntStream.rangeClosed(1,10).count());

		IntStream is = IntStream.rangeClosed(1, 10);
		System.out.print(is.summaryStatistics());
	}

}
