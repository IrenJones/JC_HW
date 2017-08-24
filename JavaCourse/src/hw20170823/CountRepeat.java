package hw20170823;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeat {
	public static void main(String [] args){
		String[] arr = {"a", "a", "h", "h", "e", "t", "a", "l", "i", "a", "v", "i", "t", "y", "a"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		Map<String, Long> mapUsual = createUsualMap(list);
		Map<String, Long> mapUnusual = createUnusualMap(list);
		System.out.println(mapUsual);
		System.out.println(mapUnusual);
	}

	private static Map<String, Long> createUnusualMap(List<String> list) {
		
		Map<String, Long> mapi = new HashMap<>();
		for(String s:list){
			Long count = mapi.get(s);
			mapi.put(s, (count == null) ? 1 : count + 1);
		}
		
		return mapi;
	}

	private static Map<String, Long> createUsualMap(List<String> list) {
		return list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	}
}
