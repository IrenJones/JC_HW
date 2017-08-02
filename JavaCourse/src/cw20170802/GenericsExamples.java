package cw20170802;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamples {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		for(Object o:list){
			System.out.println(o);
		}
		
		List<String> str = Collections.checkedList(new ArrayList<>(), String.class);// check what we add
		// so we get an error when run
		// check in add method
		List l = str;
		l.add(1);
		l.add("wou");
		
		for(Object o:l){
			System.out.println(o);
		}
		
	}

}
