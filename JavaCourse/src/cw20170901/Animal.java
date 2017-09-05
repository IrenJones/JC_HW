package cw20170901;

public class Animal {

	final private int id;
	final private String name;
	private int age;
	public Animal(int id, String name, int age){
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if (!(obj instanceof Animal)){
			return false;
		}
		
		Animal other = (Animal) obj;
		
		if (this.id != other.id){
			return false;
		}
		
		if (this.age != other.age){
			return false;
		}

		
		return this.name.equals(other.name);
	}
	
	
	@Override
	public int hashCode(){
		int hash = 7;
		hash+=31*this.name.hashCode();
		hash+=31*this.id;
		
		return hash;
	}
	
	public static void main(String[] args) {
		

	}

}
