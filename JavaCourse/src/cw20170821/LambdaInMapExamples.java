package cw20170821;

import java.util.Map;
import java.util.TreeMap;

public class LambdaInMapExamples {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		map.put("Benedict", "London");
		map.put("Sherlock", "NY");
		map.put("Natasha", "Minsk");
		map.put("Vanya", "Moscow");
	
		
		map.replaceAll((s1, s2) -> s2.toUpperCase());
		System.out.println(map);

		map.computeIfAbsent("Olya", p -> "Paris");
		System.out.println(map);
	}

}
