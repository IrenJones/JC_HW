package cw20170830;

public class RaceConditionExample {

	static int count = 0;

	static class Counter implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 1000000; i++) {
				synchronized (this) {
					count++;
				}
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
		Thread t = new Thread(c);
		t.start();
		Thread t1 = new Thread(c);
		t1.start();

		t.join();
		t1.join();

		System.out.println(count);

	}

}
