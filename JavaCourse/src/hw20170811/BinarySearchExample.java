package hw20170811;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		List <A> list = new LinkedList<>();
		long start = System.nanoTime();
		A key = new A();
		for (int i=0;i<1_000_000;i++){
			list.add(new A());
		}
		
		//System.out.println(list);
		Collections.sort(list);
		//System.out.println(list);
		//System.out.println(key);
		System.out.println(Collections.binarySearch(list, key));
		
		long stop = System.nanoTime();
		System.out.println(stop-start);
		
		List <A> arrList = new ArrayList<>();
		start = System.nanoTime();
		for (int i=0;i<1_000_000;i++){
			arrList.add(new A());
		}
		
		//System.out.println(arrList);
		Collections.sort(arrList);
		//System.out.println(arrList);
		//System.out.println(key);
		System.out.println(Collections.binarySearch(arrList, key));
		
		stop = System.nanoTime();
		System.out.println(stop-start);
		
		
		Set <A> set = new TreeSet<>();
		start = System.nanoTime();
		for (int i=0;i<1_000_000;i++){
			set.add(new A());
		}

		if (set.contains(key)){
			System.out.println("ya " + ((TreeSet<A>) set).headSet(key).size());
		}
		else{
			System.out.println("nein");
		}
		
		stop = System.nanoTime();
		System.out.println(stop-start);

	}

}



class A implements Comparable<A>{
	int x;
	static Random r = new Random(14);
	
	{
		// generate random number
		x = r.nextInt(1_000_000);
	}
	
	
	@Override
	public String toString(){
		return Integer.toString(x);	
	}


	@Override
	public int compareTo(A other) {
		return x- other.x;
	}
}
