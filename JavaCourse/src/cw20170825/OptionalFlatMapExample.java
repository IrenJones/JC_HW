package cw20170825;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {
		
		String n = null;
		Optional<String> os = Optional.ofNullable(n);
		
		Optional<Integer> oi = os.map(String::length);

	}

}
