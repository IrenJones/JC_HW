package cw20170823;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsExamples {

	public static void main(String[] args) {
		
		System.out.println(Stream.generate(Math::random).limit(20).min(Double::compare).get());
		
		// OR
		
		Stream<Double> sd = Stream.generate(Math::random);
		Stream<Double> sdlim = sd.limit(20);
		
		System.out.println(sd == sdlim);
		
		Optional <Double> opt = sdlim.min(Double::compare);
		
		Double mini = opt.get();
		
		System.out.println(mini);
		
		

	}

}
