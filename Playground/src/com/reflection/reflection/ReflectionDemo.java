package com.reflection.reflection;

import java.lang.reflect.Constructor;

//reflection in java is used to manipulate class and its members (fields, methods, contructors etc.) at runtime
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {

		// MyClass obj = new MyClass();
		Class<?> clss1 = Class.forName("com.reflection.reflection.MyClass");
		Class<?> clss2 = Class.forName("com.reflection.reflection.MyClass");

		System.out.println("Comparison to check for object equality : " + (clss1 == clss2));

		// ClassName.class
		Constructor<?> constructor = clss1.getDeclaredConstructor();
		constructor.setAccessible(true);

		MyClass newInstanceOfMyClass = (MyClass) constructor.newInstance();

	}

}

class MyClass {

	MyClass() {
		System.out.println("My Class object created");
	}
}
