package homework20170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import homework20170809.Dictionary.Pair;

public class Dictionary<T> implements Iterable<Pair> {

	static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static String[] city = {"Oslo", "Copenhagen", "Helsinki", "Reykjavik", "Stockholm"};
	
	public static class Pair<T>{
		T key;
		T value;

		public Pair(T key, T value) {
			this.key = key;
			this.value = value;
		}
	}

	private static int DEFAULT = 10;
	List<Pair<T>>[] data;
	private static int sizeOfdata = 0;
	private static int countOfPairs = 0;
	
	public Dictionary(int size){
		this.data = new List[size];
	}
	
	public Dictionary(){
		this(DEFAULT);
	}

	public void put(T key, T value) {
		int index = hash(key);
		List<Pair<T>> list = data[index];
		if (list == null) {
			list = new ArrayList<>();
			data[index] = list;
			sizeOfdata++;
		}
		Pair<T> pair = getPair(key, index);
		if (pair == null) {
			list.add(new Pair<T>(key, value));
			this.countOfPairs++;
		} else {
			pair.value = value;
		}
		
		if (sizeOfdata/data.length >=0.6){
			resize();
		}
	}
	
	
	private void resize(){
		List<Pair<T>>[] copyData = this.data;
		this.data = new List[this.data.length*2];
		this.sizeOfdata = 0;
		this.countOfPairs = 0;
		for (List<Pair<T>> l : copyData){
			if (l != null) {
				for (Pair<T> pair : l) {
					put(pair.key, pair.value);
				}
			}
		}
		//System.out.println("resize from " +this.data.length/2  + " to " + this.data.length);
	}

	private int hash(T key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public T get(T key) {
		Pair<T> pair = getPair(key, -1);
		return pair == null ? null : pair.value;
	}

	private Pair<T> getPair(T key, int ind) {
		Pair<T> res = null;
		int index = ind;
		if (index==-1){
			index = hash(key);
		}
		List<Pair<T>> l = data[index];
		if (l != null) {
			for (Pair<T> pair : l) {
				if (pair.key.equals(key)) {
					res = pair;
					break;
				}
			}
		}

		return res;
	}
	


	public static void main(String[] args) {
		testNvalues(100);
		testNvalues(1_000);
		testNvalues(1_000_000);
	}

	public static void testNvalues(int N) {
		Dictionary<String> d = new Dictionary<>();
		long start, stop;
		long putTime = 0, getTime = 0;
		Random r = new Random();
		StringBuilder sb;
		for (int n=0;n<N;n++){
			sb = new StringBuilder(5);
			for( int i = 0; i < 5; i++ ) {
				sb.append( AB.charAt( r.nextInt(AB.length()) ) );
			}
			start = System.nanoTime();
			d.put(sb.toString(), city[( r.nextInt(city.length))]);
			stop = System.nanoTime();
			putTime+=stop-start;
		}

		//int count = 0;
		for (Pair<String> pair:d){
			//System.out.println(pair.key + " " + pair.value);
			start = System.nanoTime();
			Pair<String> p = d.getPair(pair.key,-1);
			stop = System.nanoTime();
			getTime+=stop-start;
			//System.out.println(p.key + " " + p.value);
			//System.out.println();
			//count++;
		}
		
		//System.out.println("Count of added pairs: " + d.countOfPairs + "\nCount: "+ count);
		
		//System.out.println("Data max length: " + d.data.length);
		//System.out.println("Data length: " +d.sizeOfdata);
		System.out.println("Total put time: " +putTime);
		System.out.println("AVG put time: " +putTime/N);
		
		System.out.println("Total get time: " +getTime);
		System.out.println("AVG get time: " +getTime/N);
	}
	
	
	

	@Override
	public Iterator<Pair> iterator() {
		return new Iterator<Dictionary.Pair>() {
			int currentElement = -1;
			Iterator<Pair<T>> listIterator = null;

			@Override
			public boolean hasNext() {
				boolean result = false;

				if (listIterator != null && listIterator.hasNext()) {
					result = true;
				} else {
					listIterator = null;
					currentElement++;
					for (; listIterator == null && currentElement < data.length; currentElement++) {
						List<Pair<T>> list = data[currentElement];
						if (list == null) {
							continue;
						}
						listIterator = list.iterator();
						if (!listIterator.hasNext()) {
							continue;
						}
						result = true;
						break;
					}
				}
				return result;
			}

			@Override
			public Pair<T> next() {
				if (!listIterator.hasNext()){
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}

		};
	}
}
