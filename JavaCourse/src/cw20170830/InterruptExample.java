package cw20170830;

import cw20170828.Utils;

public class InterruptExample {

	public static void main(String[] args) {
		
		System.gc();
		
		Thread t = Thread.currentThread();
		// maybe or maybe not
		t.interrupt();

		Thread t1 = new Thread(()->{
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		});
		
		t1.start();
		
		Utils.pause();
		t1.interrupt();
		
		
	}

}
