package homework20170724;

class FedRat implements Brain {
	HelperPet hp;
	Rat rat;
	
	FedRat(Rat rat){
		this.rat = rat;
		this.hp = new HelperPet();
	}
	
	@Override
	public void feed() {
		hp.squeak();
	}
	
	@Override
	public void play() {
		hp.clack();
		hp.squeak();
		hp.squeak();
		this.rat.brain = new HungryRat(this.rat);
	}
	
}