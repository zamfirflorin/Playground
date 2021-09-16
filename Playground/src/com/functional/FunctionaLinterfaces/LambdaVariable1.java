package com.functional.FunctionaLinterfaces;

import java.util.function.Consumer;

public class LambdaVariable1 {
	
	public static void main(String[] args) {
		int i = 0;
		
		Consumer<Integer> c1 = (i1) -> {
			i = 2;
			System.out.println("Values is : " + i );
		};
	}

}
