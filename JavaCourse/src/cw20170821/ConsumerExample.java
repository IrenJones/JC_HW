package cw20170821;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> cm = new Consumer<String>(){

			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
			
		};
		
		Consumer<String> cm2 = (s) -> System.out.println(s);
		Consumer<String> cm3 = System.out::println;
		
		cm3.accept("Hetalia");
		
		Map <String, Integer> map = new HashMap<>();
		BiConsumer <String, Integer> bc = new BiConsumer<String, Integer>(){

			@Override
			public void accept(String t, Integer u) {
				map.put(t, u);
			}
			
		};
		
		BiConsumer <String, Integer> bc2 = (key, value)-> map.put(key, value);
		BiConsumer <String, Integer> bc3 = map :: put;
		bc3.accept("hetalia", 13);
		
		
	}

}
