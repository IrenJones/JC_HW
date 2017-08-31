package cw20170830;



public class UseWorker{
	public static void main(String[] args){
		Worker w = new Worker();
		
		
		w.execute(()->{
			System.out.println("Hello");
		});
		
		
		System.out.println(w.shutdownNow());
		
		w.execute(()->{
			System.out.println("Hej");
		});
		
		
		
		//w.shutdown();
	}
}
