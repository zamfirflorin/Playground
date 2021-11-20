package telacad.spring.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import telacad.spring.beans.Punct;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Class<Punct> punctType = (Class<Punct>) Class.forName("telacad.spring.beans.Punct");
			
			Constructor contrPunct = punctType.getDeclaredConstructor();
			contrPunct.setAccessible(true);
			
			Punct punct = (Punct) contrPunct.newInstance();
			System.out.println(punct);

			
			Field fx = punctType.getDeclaredField("x");
			Field fy = punctType.getDeclaredField("y");
			fx.setAccessible(true);
			fy.setAccessible(true);
			fx.setInt(punct, 10);
			
			
			Method m = punctType.getDeclaredMethod("showXY");
			m.setAccessible(true);
			m.invoke(punct, null);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
