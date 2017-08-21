package cw20170821;

public class AnonymousAsLambdaDemo {

	public static void main(String[] args) {
		
		Runnable procedure= new Runnable(){

			@Override
			public void run() {
				System.out.println("Hetalia");	
			}	
		};
		
		Runnable procedureNext = new Runnable(){

			@Override
			public void run() {
				System.out.println("No Hetalia");	
			}	
		};
		
		process(procedure);
		process(procedureNext);
		algo(procedure, procedureNext);

	}

	private static void algo(Runnable step1, Runnable step2) {
		step1.run();
		step2.run();
		
	}

	private static void process(Runnable procedure) {
		procedure.run();
		
	}

}
