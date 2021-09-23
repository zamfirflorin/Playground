package com.reflection.reflection;

import java.lang.reflect.Constructor;


//reflection in java is used to manipulate class and its members (fields, methods, contructors etc.) at runtime
public class GettingClassObject {

	public static void main(String[] args) throws Exception {
		
		//1. first method using forName() static method
		Class<?> clss1 = Class.forName("com.reflection.reflection.MyClass");
		Class<?> clss2 = Class.forName("com.reflection.reflection.MyClass");

		System.out.println("Comparison to check for object equality : " + (clss1 == clss2));
		
		//2. second way for getting the class object is by using ClassName.class
		//when the name of the class is known in advance and added to the project
		Class<?> intClassObj = int.class;
		Class<?> stringClassObj = String.class;
		
		
		//obj.getClass()
		MyClass m = new MyClass();
		Class<? extends MyClass> anotherexample= m.getClass();
		
		//super class 
		Class<?> superclass = clss1.getSuperclass();
		
		//get interfaces
		Class<?>[] intefaces = clss1.getInterfaces();
		
		//getName
		
		System.out.println("Name of the class " + clss1.getName());
		System.out.println("Canonical name of the class " + clss1.getCanonicalName());
		
		
		
	}

}
