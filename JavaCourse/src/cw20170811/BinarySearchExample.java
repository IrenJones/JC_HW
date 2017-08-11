package cw20170811;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		List <A> list = new LinkedList<>();
		A key = new A();
		for (int i=0;i<20;i++){
			list.add(new A());
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(key);
		System.out.println(Collections.binarySearch(list, key));

	}

}
