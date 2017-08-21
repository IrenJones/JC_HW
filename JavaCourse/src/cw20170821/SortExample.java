package cw20170821;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List <Person> list = new ArrayList<>();
		list.add(new Person("Salamander", 22));
		list.add(new Person("Benedict", 42));

		list.sort(new NameComparator());
		System.out.println(list);
		
		//Comparator <Person> byAge = (Person p1, Person p2) -> p1.getAge() - p2.getAge();
		//list.sort(byAge);
		//System.out.println(list);
		
		//ToIntFunction<Person> ageFunction = p-> p.getAge();
		//ToIntFunction<Person> ageFunction1 = Person::getAge;
		
		list.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
		System.out.println(list.toString());
	}

}

class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}

class Person{
	final String name;
	final int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	
	@Override
	public String toString(){
		return name+" : " + age;
	}
}
