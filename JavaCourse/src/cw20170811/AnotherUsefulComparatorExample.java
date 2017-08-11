package cw20170811;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnotherUsefulComparatorExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person ("Alfred", "USA"));
		list.add(new Person ("Natasha", "Belarus"));
		list.add(new Person ("Matthew", "Canada"));
		list.add(new Person ("Kolya", "Belarus"));
		list.add(new Person ("Margarret", "Canada"));
		list.add(new Person ("Alice", "UK"));
		list.add(new Person ("Aino", "Finland"));
		list.add(new Person ("Tino", "Finland"));
		
		list.sort(new CompareByName());
		list.sort(new CompareByCountry());
		
		System.out.println(list);

	}

}


class CompareByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class CompareByCountry implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.country.compareTo(o2.country);
	}
	
}


class Person{
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	@Override
	public String toString(){
		return this.name + " : " + this.country;
		
	}
	
	String name;
	String country;
}
