package cw20170830;

import java.util.List;

public class UseWorker{
	public static void main(String[] args){
		Worker w = new Worker();
		
		
		w.execute(()->{
			System.out.println("Hello");
		});
		
		
		w.execute(()->{
			System.out.println("Hej");
		});
		
		w.execute(()->{
			System.out.println("Hej1");
		});
		
		w.execute(()->{
			System.out.println("Hej16");
		});
		
		
		w.execute(()->{
			System.out.println("Hej2");
		});
		
		List<Runnable> r = w.shutdownNow();
		
		w.execute(()->{
			System.out.println("Hej17");
		});
		
		for (int i=0;i<r.size();i++){
			System.out.println(r.get(i));
		}
		
		//w.shutdown();
	}
}
