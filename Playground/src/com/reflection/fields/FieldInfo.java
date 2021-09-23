package com.reflection.fields;

import java.lang.reflect.Field;

public class FieldInfo {

	public static void main(String[] args) throws Exception {
		
		Entity e = new Entity(10, "id");
		
		Class<? extends Entity> myClass = e.getClass();
		
		Field[] fields = myClass.getFields();
		
		//get all public fields
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		//get all fields including private ones
		Field[] declaredFields = myClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}
		
		//non-declared members : all the public elements in that class and in its super class
		//declared : all the fields or all the elements present in that class 
		
		Field field = myClass.getField("type");
		field.set(e, "rollNo.");
		
		System.out.println(e.getType());
		
		Field privateField = myClass.getDeclaredField("val");
		//privateField.set(e, 19);
		//System.out.println(e.getVal());
		privateField.setAccessible(true);
		privateField.set(e, 19);
		System.out.println(e.getVal());
		
	}

}
