package cw20170811;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SortedSetExample {

	public static void main(String[] args) {
		
		//Set<C> set = new TreeSet<>();
		Set<C> set = new HashSet<>();
		
		for(int i=0;i<10;i++){
			set.add(new C());
		}

		System.out.println(set.toString());
	}

}


class C implements Comparable<C>{
	int x;
	static Random r = new Random();
	
	{
		// generate random number
		x = r.nextInt(100);
	}
	
	
	@Override
	public String toString(){
		return Integer.toString(x);	
	}


	@Override
	public int compareTo(C other) {
		return x- other.x;
	}
}
