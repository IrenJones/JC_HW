package cw20170828;

public class GetMainThreadExample {

	public static void main(String[] args) {
		
		new Thread(()->{
			Thread cur = Thread.currentThread();
			ThreadGroup tg = cur.getThreadGroup();
			Thread [] th = new Thread[tg.activeCount()];
			tg.enumerate(th);
			
			for (Thread t: th){
				System.out.println(t);
			}
		}).start();
		
		Utils.pause(6000);

	}

}
