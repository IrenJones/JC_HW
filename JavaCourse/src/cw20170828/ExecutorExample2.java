package cw20170828;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {

	public static void main(String[] args) throws InterruptedException {

		//ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newCachedThreadPool();

		for (int i=1;i<10;i++){
			int tmp = i;
			service.execute(() -> {
				System.out.println("Hej" + tmp);
				Utils.pause();
			});
		}
		
		
		service.shutdown();
		boolean sc = service.awaitTermination(1, TimeUnit.HOURS);
		System.out.println("finish " + sc);
		

	}

}
