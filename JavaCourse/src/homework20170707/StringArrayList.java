package homework20170707;

import java.util.Arrays;

public class StringArrayList {

	private static final int DEFAULT_SIZE = 10;
	
	String[] elements = new String[DEFAULT_SIZE];
	
	int size = 0;
	
	public void add(String s){
		if(size == elements.length){
			elements = Arrays.copyOf(elements, elements.length*2);
		}
		elements[size++] = s;
	}
	
	public void remove(int index){
		if (index >= size || index < 0){
			return;
		}
		System.arraycopy(elements, index+1, elements, index, size-index-1);
		size--;
		elements[size]=null;
	}
	
	public void remove(String value){
		for(int i=0;i<size;i++){
			if (elements[i].equals(value)){
				this.remove(i);
			}
		}
		return;
	}
	
	public String get(int index){
		if (index<0 || index>=size){
			return "";
		}
		return elements[index];
	}
	
	public void set(int index, String value){
		if (index<0 || index>=size){
			return;
		}
		elements[index] = value;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0?true:false;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder('[');

		if (elements.length > 0) {
			sb.append(elements[0]);
			for (int i = 1; i < elements.length; i++) {
				sb.append(",").append(elements[i]);
			}
		}
		
		sb.append(']');

		return sb.toString();
	}
	
}

