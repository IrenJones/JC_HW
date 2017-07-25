package homework20170724;


public class Cat implements Pet {
	
	private Brain brain = this.new Hungry();
	
	private class Hungry implements Brain {

		@Override
		public void feed() {
			meow();
			eat();
			meow();
			brain = new Fed();
		}

		@Override
		public void play() {
			hiss();
		}
		
	}
	
	private class Fed implements Brain {
		
		@Override
		public void feed() {
			meow();
		}
		
		@Override
		public void play() {
			meow();
			murmur();
			murmur();
			brain = new Hungry();
		}
		
	}
	
	@Override
	public void feed() {
		brain.feed();
	}
	


	@Override
	public void play() {
		brain.play();
	}

	private void murmur() {
		System.out.println("murmur");
	}
	
	private void hiss() {
		System.out.println("hiss");
	}
	
	private void eat() {
		System.out.println("eats");
	}

	private void meow() {
		System.out.println("meow");
	}


}
