package cw20170710;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {

	public static void main(String [] args) throws InterruptedException{

		Instant start = Instant.now();
		
		Thread.sleep(3000);
		
		Instant stop = Instant.now();
		
		Duration elapsed = Duration.between(start, stop);
		System.out.println(elapsed.toMillis());
	}
}
