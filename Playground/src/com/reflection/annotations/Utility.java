package com.reflection.annotations;


@MostUsed
public class Utility {
	
	void doStuff() {
		
		System.out.println("Performs some stuff");
	
	}
	
	@MostUsed
	void doStuff(String arg) {
		System.out.println("Operationg on " + arg);
	}
	
	void doStuff(int i) {
		System.out.println("Operationg on integer " + i);
	}

}


//inherits the @MostUsed annotation
class SubUtility extends Utility {
	
}
