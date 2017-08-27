package cw20170825;

import java.util.stream.IntStream;

public class PrimitiveStreamsExample {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1,10).forEach(System.out::println);

	}

}
