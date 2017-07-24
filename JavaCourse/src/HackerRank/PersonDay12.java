package HackerRank;

public class PersonDay12 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	PersonDay12(String firstName, String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = id;
	}
	
	public void printPerson(){
		System.out.println("Name: " + lastName + ", " + firstName
				+ "\nID: " + idNumber);
	}
}
