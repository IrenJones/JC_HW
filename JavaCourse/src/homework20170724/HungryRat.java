package homework20170724;

class HungryRat implements Brain {
	HelperPet hp;
	Rat rat;
	
	HungryRat(Rat rat){
		this.rat = rat;
		this.hp = new HelperPet();
	}
	
	@Override
	public void feed() {
		hp.clack();
		hp.eat();
		hp.squeak();
		this.rat.brain = new FedRat(this.rat);
	}

	@Override
	public void play() {
		hp.clack();
	}
	
}