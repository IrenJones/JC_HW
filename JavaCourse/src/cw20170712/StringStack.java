package cw20170712;

import java.util.Arrays;

public class StringStack {
	
	private static final int DEFAULT_MAX_SIZE = 3;
	private String[] elements;
	private int size = 0;
	
	public StringStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	public StringStack(int maxSize){
		elements = new String[maxSize];
		size = 0;
	}

	public boolean push(String string) {
		if(size>=elements.length){ // guard condition - stack overflow
			return false;
		}
		elements[size++] = string;
		return true;
	}

	public String pop() {
		if(size == 0){ // guard condition - stack underflow
			return null;
		}
		size--;
		String res = elements[size];
		elements[size] = null;
		return res;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		/*StringBuilder s = new StringBuilder("[");
		for(int i=0;i<size;i++){
			s.append(elements[i]);
			if (i != size - 1){
				s.append(", ");
			}
		}
		s.append("]");
		return s.toString();
		*/
		return Arrays.toString(Arrays.copyOf(elements, size));
	}
	
	public String tos() {
		return size == 0? null: elements[size-1];
	}
	
}
