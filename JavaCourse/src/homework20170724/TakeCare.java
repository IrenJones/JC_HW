package homework20170724;

public class TakeCare {
	
	public static void main(String[] args) {
		
		Pet pet = new Dog();
		
		pet.play();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		
		pet = new Cat();
		
		pet.play();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		
		pet = new Rat();
		
		pet.play();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		pet.play();
		
	}

}
