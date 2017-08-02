package cw20170802;

import java.util.Arrays;

public class ExampleStack <E> {

	private static final int DEFAULT_MAX_SIZE = 5;
	private E[] elements;
	private int size = 0;
	
	public ExampleStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	public ExampleStack(int maxsize){
		if (maxsize<=0){
			return;
		}
		elements = (E[])new Object[maxsize];
		size = 0;
	}
	
	public boolean push(E element) {
		if (elements.length <= size){
			return false;
		}
		elements[size++]=element;
		return true;
	}

	public E pop() {
		if (size == 0){
			return null;
		}
		
		E result = elements[--size];
		return result;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}

	public E tos() {
		return size==0? null: elements[size-1];
	}
	
	
}
