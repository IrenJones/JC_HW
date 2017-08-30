package cw20170828;

public class ThreadCreationPuzzle {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("not het");
		}) {
			@Override
			public void run() {
				System.out.println("het");
			}
		}.start();

		
		
	}

}
