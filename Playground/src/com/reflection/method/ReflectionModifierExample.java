package com.reflection.method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.reflection.fields.Entity;

//Modifier provides methods and constants to decode class and member access modifiers
public class ReflectionModifierExample {

	public static void main(String[] args) throws Exception, SecurityException {
	
		Entity ent = new Entity(10, "10");
		Class<? extends Entity> clss = ent.getClass();
		
		int modifiers = clss.getModifiers();
		
		System.out.println(modifiers);
		
		int n = modifiers & Modifier.PUBLIC; //return either 0 or 1 - 0 means the class is not public "&" bit operator - 0 false / 1 true 
		System.out.println("n : " + n);
		Method meth = clss.getMethod("getVal");
		int methodModifier = meth.getModifiers();
		int checkPrivate = methodModifier & Modifier.PRIVATE; //check to see if the modifier is private
		System.out.println("checkPrivate : " + checkPrivate);
		
		//check if the class is public
		boolean isPublicClss = Modifier.isPublic(modifiers);
		System.out.println(isPublicClss);
		
		boolean isPublicMethod = Modifier.isPublic(methodModifier);
		System.out.println(isPublicMethod);
		
		System.out.println(Modifier.toString(modifiers));
	}

}
