package homework20170724;

public class Rat implements Pet {
	boolean state = false;	
	public Brain brain = new HungryRatBrainState(this);
	
	@Override
	public void feed() {
		brain.feed();
	}
	
	@Override
	public void play() {
		brain.play();
	}
}

