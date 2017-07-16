package HackerRank;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if (initialAge < 0 ){
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		else{
			age = initialAge;
		}
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:

		String answer = "";
		if (this.age < 13){
			answer = "You are young.";
		}
		else if (this.age >= 13 && this.age < 18){
			answer = "You are a teenager.";
		}
		else{
			answer = "You are old.";
		}
        System.out.println(answer);
	}

	public void yearPasses() {
  		// Increment this person's age.
		this.age++;
	}
	
}
