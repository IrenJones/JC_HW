package homework20170724;

class FedRat implements Brain {
	
	@Override
	public void feed() {
		squeak();
	}
	
	@Override
	public void play() {
		clack();
		squeak();
		squeak();
	}
	
	private void squeak() {
		System.out.println("squeak-squeak");
	}
	
	private void clack() {
		System.out.println("clack");
	}
	
}