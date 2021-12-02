package com.stream.streams;


public abstract class Parent {

	Parent() {
		System.out.println("a");
	}

	void doSomething() {
		System.out.println("1");
	}
	
}
	class Child extends Parent {
		Child() {
			System.out.println("b");
		}
		void doSomething() {
			System.out.println("2");
		}
	}



