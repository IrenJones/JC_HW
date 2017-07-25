package homework20170724;

class HungryRat implements Brain {
	@Override
	public void feed() {
		clack();
		eat();
		squeak();
	}

	@Override
	public void play() {
		clack();
	}
	

	private void squeak() {
		System.out.println("squeak-squeak");
	}
	
	private void eat() {
		System.out.println("eats");
	}

	private void clack() {
		System.out.println("clack");
	}
	
}