package cw20170830;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleALot {

	static class Modifier implements Runnable{

		private Model model;
		
		public Modifier(Model model){
			this. model = model;
		}
		
		@Override
		public void run() {
			for(int i=0;i<1000;i++){
				model.change(i);
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Model m = new Model();
		Modifier mm = new Modifier(m);
		Thread t = new Thread(mm);
		
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(t);
		service.execute(t);
		service.execute(t);
		
		//t.start();
		
		//t.join();
		service.shutdown();
		service.awaitTermination(1, TimeUnit.HOURS);
		m.check();
		
		System.out.println("finish");

	}

}

class Model{
	int x = 0;
	int y = 0;
	
	synchronized public void change(int z){
		x+=z;
		y-=z;
	}
	
	public void check(){
		if (x + y !=0){
			throw new IllegalStateException();
		}
	}
}
