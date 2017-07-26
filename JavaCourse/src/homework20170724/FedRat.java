package homework20170724;

class FedRat implements Brain {
	HelperPet hp = new HelperPet();
	
	@Override
	public void feed() {
		hp.squeak();
	}
	
	@Override
	public void play() {
		hp.clack();
		hp.squeak();
		hp.squeak();
	}
	
}