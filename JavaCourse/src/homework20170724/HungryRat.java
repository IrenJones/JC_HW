package homework20170724;

class HungryRat implements Brain {
	HelperPet hp = new HelperPet();
	
	@Override
	public void feed() {
		hp.clack();
		hp.eat();
		hp.squeak();
	}

	@Override
	public void play() {
		hp.clack();
	}
	
}