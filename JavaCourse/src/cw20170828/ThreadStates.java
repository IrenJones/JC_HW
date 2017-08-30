package cw20170828;

public class ThreadStates {

	public static void main(String[] args) {

		for (Thread.State state : Thread.State.values()) {
			System.out.println(state);
		}

		Thread t = new Thread(() -> {
			while (true) {

			}
		});
		t.start();
		System.out.println(t.getState());

		Thread t2 = new Thread(()->{
			System.out.println("nya!" + Thread.currentThread());
		});
		t2.start();
		try {
			System.out.println("joining!");
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("nya-joined!");
		System.out.println(t2.getState());
		

	}

}
