package com.reflection.method;

import java.lang.reflect.Method;
import java.util.ArrayList;

import com.reflection.fields.Entity;

public class ReflectionMethodExample {

	public static void main(String[] args) throws Exception {

		Entity ent = new Entity(10, "10");
		Class<? extends Entity> clss = ent.getClass();

		// all methods including those inherited from object and super classes
		Method[] classMethods = clss.getMethods();

		for (Method method : classMethods) {
			System.out.println(method.getName());
		}

		System.out.println("\n Declared methods \n");

		// all methods only from entity
		Method[] declaredMethods = clss.getDeclaredMethods();

		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}

		Method meth = clss.getMethod("setVal", int.class);
		// set value for the val field of the ent object created above
		meth.invoke(ent, 15);

		Method meth2 = clss.getMethod("getVal", null);
		System.out.println(meth2.invoke(ent, null));

	}

}
