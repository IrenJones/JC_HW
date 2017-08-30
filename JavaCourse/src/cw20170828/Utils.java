package cw20170828;

public class Utils {
	
	public static void pause() {
		pause(1000);

	}

	public static void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
