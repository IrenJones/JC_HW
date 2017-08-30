package cw20170830;

import cw20170828.Utils;

public class InterruptExample2 {

	public static void main(String[] args) {

		Counter c = new Counter();
		Thread t = new Thread(c);
		t.start();
		Utils.pause(5000);
		c.shutdown();

	}

}

class Counter implements Runnable {

	/*volatile boolean stop = false;

	@Override
	public void run() {
		long count = 0;
		while (!stop) {
			count++;
		}
		System.out.println(count);

	}

	public void shutdown() {
		stop = true;
	}
	
	*/
	
	private Thread t;
	
	@Override
	public void run() {
		t =  Thread.currentThread();
		long count = 0;
		while (!Thread.interrupted()) {
			count++;
		}
		System.out.println(count);

	}
	
	public void shutdown() {
		t.interrupt();
	}

}
