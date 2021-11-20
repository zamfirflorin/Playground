package telacad.spring.reflection;

import telacad.spring.beans.Punct;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class<Punct> punctType = (Class<Punct>) Class.forName("beans.Punct");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
