package telacad.spring.beans;

public class Punct {
	
	private int x; 
	private int y; 
	
	private Punct() {
	
	}
	
	private void showXY() {
		System.out.println("Coordonate : " + x + " " + y);
	}

}
