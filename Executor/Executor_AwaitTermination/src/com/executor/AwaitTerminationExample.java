package com.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 1; i < 100; i++) {

			int num = i;
			executorService.submit(() -> {

				System.out.println(String.format("Thread %s factorial of %d is " + fectorial(num),
						Thread.currentThread().getName(), num));

			});
			
			

		}

		executorService.shutdown();

		
		while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
			continue;
		}

		System.out.println(executorService.isShutdown());
		System.out.println(executorService.isTerminated());

		System.out.println("Task Completed");
	}

	private static int fectorial(int num) {

		
		int result = 1;

		for (int i = 1; i <= num; i++) {

			result *= i;
		}

		return result;
	}

}
