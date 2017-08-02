package homework20170724;

class FedRatBrainState implements Brain {
	HelperPet hp;
	Rat rat;
	
	FedRatBrainState(Rat rat){
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
		this.rat.brain = new HungryRatBrainState(this.rat);
	}
	
}