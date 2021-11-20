package telacad.spring.beans;

public class Punct {
	
	private int x; 
	private int y; 
	
	private Punct() {
	
	}
	
	public void showXY() {
		System.out.println("Coordonate : " + x + " " + y);
	}

}
