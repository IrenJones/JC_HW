package cw20170807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {

	private static final int MAX = 1000000;
	static Random r = new Random();

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		List<Integer> l = new LinkedList<>();
		
		testFill(a);
		testFill(l);

	}
	
	public static void testFill(List<Integer> list){
		long start = System.nanoTime();
		fill(list);
		long stop = System.nanoTime();
		System.out.println(stop-start);
	}

	private static void fill(List<Integer> a) {
		for (int i=0;i< MAX;i++){
			a.add(r.nextInt());
		}
		
	}

}
