package cw20170821;

public class LambdaInsteadOfAnonymousDemo {

public static void main(String[] args) {
		
		Runnable procedure= () -> System.out.println("Hetalia");	
		
		Runnable procedureNext = () -> {
				System.out.println("No Hetalia" + procedure);		
		};
		
		process(procedure);
		process(procedureNext);
		algo(procedure, procedureNext);
		
		new Thread(procedure).start();

	}

	private static void algo(Runnable step1, Runnable step2) {
		step1.run();
		step2.run();
		
	}

	private static void process(Runnable procedure) {
		procedure.run();
		
	}



	}
