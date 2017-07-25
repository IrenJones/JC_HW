package homework20170724;

public class Rat implements Pet {
	boolean state = false;
	
	private HungryRat brainHungry = new HungryRat();
	private FedRat brainFed = new FedRat();
	
	@Override
	public void feed() {
		if (state == false){
			brainHungry.feed();
			state = true;
		}
		else{
			brainFed.feed();
		}
	}
	
	@Override
	public void play() {
		if (state == false){
			brainHungry.play();
		}
		else{
			brainFed.play();
			state = false;
		}
	}
}

