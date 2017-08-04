package cw20170804;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeMap;

public class PriorityQueueExample {

	
	
	
	private static final int MAX = 100000;

	public static void main(String[] args) {

		PriorityQueue <Integer> pq = new PriorityQueue<>();
		pq.add(30);
		pq.add(0);
		pq.add(13);
		pq.add(14);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		Random r = new Random();
		// How to get 10 biggest transaction? Easy!
		for(int i=0;i<MAX;i++){
			pq.add(r.nextInt(1000000000));
			if (pq.size() >10){
				pq.poll();
			}
		}
		System.out.println(pq);
		
		
		Map<String, Integer> wordCount = new HashMap<>();
		fill(wordCount);
		
		Map<String, Integer> wordCount2 = new LinkedHashMap<>();
		
		
		Map<String, Integer> wordCount3 = new TreeMap<>();
		
	}

	private static void fill(Map<String, Integer> wordCount) {
		List<String> words = Arrays.asList("one", "two", "three", "one", "two");
		
		for(String word:words){
			Integer count = wordCount.get(word);
			if (count == null){
				wordCount.put(word, 1);
			}
			else{
				wordCount.put(word, ++count);
			}
		}
		
	}

}
