package com.florin.Lambda;

import java.util.Comparator;

public class ComparatorLambdaImplementation {

	public static void main(String[] args) {
		
		//prior java 8
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		};
		int result = comp.compare(2, 2);
		System.out.println(result);
		
		//java 8
		Comparator<Integer> compLamda1 = (Integer a, Integer b) -> {return a.compareTo(b);};
		
		Comparator<Integer> compLamda2 = (a,  b) -> {return a.compareTo(b);};
		
		int val = compLamda1.compare(2, 2);
		System.out.println(val);
		
		
	}

}
