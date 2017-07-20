package cw20170719;

public class RunnableExamples {
	public static void main(String [] args){
		Thread t = new Thread(new Task());
		t.start();
		
		//new Task().run();
		
		Runnable task = () -> {
			int count = 0;
			while(true){
				System.out.println(count++);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(task);
		t1.start();
		
		
		Runnable task1 = new Task();
		Thread t2 = new Thread(task1);
		t2.start();
		task1.run();
	}
}



class Task implements Runnable{

	@Override
	public void run() {
		int count = 0;
		while(true){
			System.out.println(count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}