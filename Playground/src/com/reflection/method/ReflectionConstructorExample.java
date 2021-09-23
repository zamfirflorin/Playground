package com.reflection.method;

import java.lang.reflect.Constructor;

import com.reflection.fields.Entity;

public class ReflectionConstructorExample {

	public static void main(String[] args) throws Exception {

		Entity ent = new Entity(10, "10");

		Class<?> clss = Class.forName("com.reflection.fields.Entity");
		Constructor<?>[] constructors = clss.getConstructors();

		for (Constructor<?> constr : constructors) {
			System.out.println(constr);
		}

		Constructor<?>[] declaredConstructors = clss.getDeclaredConstructors();
		for (Constructor<?> constr : declaredConstructors) {
			System.out.println(constr);
		}

		Constructor<?> publicConstructor = clss.getConstructor(int.class, String.class);
		Entity reflEnt = (Entity) publicConstructor.newInstance(10, "created with reflection");

		System.out.println(reflEnt.getVal() + " " + reflEnt.getType());

		Constructor<?> privateDeclaredConstructor = clss.getDeclaredConstructor();
		privateDeclaredConstructor.setAccessible(true);
		Entity entFromPrivateConstr = (Entity) privateDeclaredConstructor.newInstance();

		System.out.println(entFromPrivateConstr.getType() + " " + entFromPrivateConstr.getVal());
		
		
		

	}

}
