package cw20170830;

import cw20170828.Utils;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		Object monitor = new Object();
		Thread thread = new Thread(()->{
			System.err.println("trying");
			synchronized (monitor){
				System.err.println("locked");
				try{
					monitor.wait();
					System.err.println("notified!");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
		
		Utils.pause(20000);
		
		synchronized(monitor){
			/*System.out.println("start");
			thread.start();
			System.out.println("sleep");
			Utils.pause(5000);
			System.out.println("awake");
			*/
			System.out.println("notify me");
			monitor.notify();
			System.out.println("sleeping");
			Utils.pause(4000);
		}

	}

}
