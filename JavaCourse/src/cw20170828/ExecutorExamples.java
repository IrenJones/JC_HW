package cw20170828;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExamples {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();

		service.execute(() -> {
			System.out.println("Hej!");
			Utils.pause();
		});
		
		service.execute(() -> {
			System.out.println("Hej!");
			Utils.pause();
		});
		
		service.execute(() -> {
			System.out.println("Hej!");
			Utils.pause();
		});
		
		//service.shutdown();
		
		List<Runnable> tl = service.shutdownNow();
		System.out.println(tl);

	}

}
