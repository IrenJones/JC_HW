package homework20170724;

class HungryRatBrainState implements Brain {
	HelperPet hp;
	Rat rat;
	
	HungryRatBrainState(Rat rat){
		this.rat = rat;
		this.hp = new HelperPet();
	}
	
	@Override
	public void feed() {
		hp.clack();
		hp.eat();
		hp.squeak();
		this.rat.brain = new FedRatBrainState(this.rat);
	}

	@Override
	public void play() {
		hp.clack();
	}
	
}