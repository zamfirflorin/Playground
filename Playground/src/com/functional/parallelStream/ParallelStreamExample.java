package com.functional.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.out.println("Sequential stream result : " 
												+ checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
		System.out.println("Parallel stream result : " + checkPerformanceResult(ParallelStreamExample::sum_parallel_Stream, 20));

	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1,  100000).sum();
	}
	
	public static int sum_parallel_Stream() {
		return IntStream
				.rangeClosed(1,  100000)
				.parallel() //split the data into multiple parts
				.sum();
	}
	
	public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfTimes; i++) {
			supplier.get();
			
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
