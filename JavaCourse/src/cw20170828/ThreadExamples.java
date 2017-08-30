package cw20170828;

public class ThreadExamples {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(1000);
		
		/*Thread thread = new Thread(()->{
			int count = 0;
			while(true){
				try{
				Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.println(count++);
			}
		});
		thread.start();
		*/
		
		new Thread(()->{
			System.out.println("Hello, world");
		}).start();
		
		new Thread(){
			@Override
			public void run(){
				System.out.println("Hello, I'm anonymous");
			}
		}.start();
		
		new MyThread().start();
	}

}

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("Salut!");
	}
}
