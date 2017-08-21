package cw20170821;

public class EffectivelyFinalVariables {

	public static void main(String[] args) {
		
		int x = 13;
		
		Runnable r = new Runnable(){

			@Override
			public void run() {
				makePause(2500);
				System.out.println(x);
			}
	
		};
		
		new Thread(r).start();
		makePause(1000);
		System.out.println("Finish");

	}
	
	public static void makePause(int time) {
		try{
			Thread.sleep(time);	
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

}
