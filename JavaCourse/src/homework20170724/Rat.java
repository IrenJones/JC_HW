package homework20170724;

public class Rat implements Pet {
	Brain brain = new HungryRatBrainState(this);
	
	@Override
	public void feed() {
		brain.feed();
	}
	
	@Override
	public void play() {
		brain.play();
	}
}

