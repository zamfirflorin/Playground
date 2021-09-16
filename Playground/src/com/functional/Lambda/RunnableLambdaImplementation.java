package com.functional.Lambda;

public class RunnableLambdaImplementation {

	public static void main(String[] args) {

		// prior to java 8
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable I");
			}
		};
		new Thread(runnable).start();
		
		// java 8
		Runnable runLambda = () -> {System.out.println("Runnable lambda");};
		new Thread(runLambda).start();
		
		Runnable runLambda2 = () -> System.out.println("Runnable lambda second version");
		new Thread(runLambda2).start();
		
		new Thread(() -> System.out.println("Runnable 4")).start();
		
		Runnable runnableMultyStatements = () -> {
			System.out.println("First statement");
			System.out.println("Second statement");
		};
		new Thread(runnableMultyStatements).start();
		
	}

	

}
