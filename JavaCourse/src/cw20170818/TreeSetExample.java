package cw20170818;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i=0;i<30;i++){
			set.add(r.nextInt(100));
		}
		System.out.println(set);
		SortedSet<Integer> ss = set.subSet(20, 50);
		
		System.out.println(ss);
		
		
		Integer ceil = set.ceiling(50);
		System.out.println(ceil);
		System.out.println(ss.first());
		System.out.println(ss.last());
	}

}
