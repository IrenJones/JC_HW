package cw20170828;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SheduledExecutorServicesExamples {

	public static void main(String[] args) {
		
		
		ScheduledExecutorService s = Executors.newScheduledThreadPool(1);
		
		s.execute(()->{
			System.out.println("Hej!");
		});
		
		s.schedule(()->{
			System.out.println("Hej-hej!");
		}, 5, TimeUnit.SECONDS);
		
		
		s.scheduleAtFixedRate(()->{
			System.out.println("Hej-hej-hej!");
		}, 1,1, TimeUnit.SECONDS);
		
		s.scheduleWithFixedDelay(()->{
			System.out.println("Hej-hej-hej-hej!");
		}, 1,1, TimeUnit.SECONDS);
		
		
	}

}
