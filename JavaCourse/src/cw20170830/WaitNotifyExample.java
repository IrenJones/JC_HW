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
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		
		synchronized(monitor){
			System.out.println("start");
			thread.start();
			System.out.println("sleep");
			Utils.pause(5000);
			System.out.println("awake");
		}

	}

}
