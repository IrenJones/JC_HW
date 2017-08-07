package cw20170807;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<>();
		Set<String> cities2 = new LinkedHashSet<>();
		Set<String> cities3 = new TreeSet<>();
		
		cities.add("Kirovsk");
		cities.add("Vitebsk");
		cities.add("Voronezh");
		cities.add("Minsk");
		cities.add("Kirovsk");
		cities.add("Voronezh");
		
		System.out.println(cities);

		
		cities2.add("Kirovsk");
		cities2.add("Vitebsk");
		cities2.add("Voronezh");
		cities2.add("Minsk");
		cities2.add("Kirovsk");
		cities2.add("Voronezh");
		
		System.out.println(cities2);
		
		cities3.add("Kirovsk");
		cities3.add("Vitebsk");
		cities3.add("Voronezh");
		cities3.add("Minsk");
		cities3.add("Kirovsk");
		cities3.add("Voronezh");
		
		System.out.println(cities3);
	}

}
