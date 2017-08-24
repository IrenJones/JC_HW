package cw20170823;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLifeCycleExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Voronezh");
		list.add("Minsk");
		list.add("Vitebsk");
		
		Stream<String> mapped = list.stream().map(String::toUpperCase);
		list.add("Moscow");
		
		mapped.forEach(System.out::println);
		
		Stream<String> limited = mapped.limit(3);
		mapped.forEach(System.out::println);
	}

}
