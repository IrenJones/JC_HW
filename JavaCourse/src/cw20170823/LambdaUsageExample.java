package cw20170823;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsageExample {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Minsk");
		list.add("Moscow");
		list.add("Vitebsk");
		list.add("Voronezh");
		
		System.out.println(list);
		list.forEach(s -> System.out.println(s));
		
		list.removeIf(s-> s.length()>6);
		list.forEach(System.out :: println);

	}

}
