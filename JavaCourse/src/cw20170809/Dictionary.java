package cw20170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cw20170809.Dictionary.Pair;

public class Dictionary implements Iterable<Pair> {

	public static class Pair {
		String key;
		String value;

		public Pair(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private static final int MAX = 10;
	List<Pair>[] data = new List[MAX];

	public void put(String key, String value) {
		int index = hash(key);
		List<Pair> list = data[index];
		if (list == null) {
			list = new ArrayList<>();
			data[index] = list;
		}
		Pair pair = getPair(key);
		if (pair == null) {
			list.add(new Pair(key, value));
		} else {
			pair.value = value;
		}
	}

	private int hash(String key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public String get(String key) {
		Pair pair = getPair(key);
		return pair == null ? null : pair.value;
	}

	private Pair getPair(String key) {
		Pair res = null;
		int index = hash(key);
		List<Pair> l = data[index];
		if (l != null) {
			for (Pair pair : l) {
				if (pair.key.equals(key)) {
					res = pair;
					break;
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.put("Ann", "London");
		d.put("Ann", "Paris");

		for (Pair pair:d){
			System.out.println(pair.key + " " + pair.value);
		}

	}

	@Override
	public Iterator<Pair> iterator() {
		return new Iterator<Dictionary.Pair>() {
			int currentElement = -1;
			Iterator<Pair> listIterator = null;

			@Override
			public boolean hasNext() {
				boolean result = false;

				if (listIterator != null && listIterator.hasNext()) {
					result = true;
				} else {
					listIterator = null;
					currentElement++;
					for (; listIterator == null && currentElement < data.length; currentElement++) {
						List<Pair> list = data[currentElement];
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
			public Pair next() {
				if (!listIterator.hasNext()){
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}

		};
	}
}
