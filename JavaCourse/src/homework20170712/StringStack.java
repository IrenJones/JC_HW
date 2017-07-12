package homework20170712;

import java.util.Arrays;

public class StringStack {

	private static final int DEFAULT_MAX_SIZE = 5;
	private String[] elements;
	private int size = 0;
	
	public StringStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	public StringStack(int maxsize){
		if (maxsize<=0){
			return;
		}
		elements =  new String[maxsize];
		size = 0;
	}
	
	public boolean push(String string) {
		if (elements.length <= size){
			return false;
		}
		elements[size++]=string;
		return true;
	}

	public String pop() {
		if (size == 0){
			return null;
		}
		
		String result = elements[--size];
		return result;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}

	public String tos() {
		return size==0? null: elements[size-1];
	}
	
	
}
