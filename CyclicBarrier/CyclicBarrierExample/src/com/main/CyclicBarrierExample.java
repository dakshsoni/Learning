package com.main;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

	public static void main(String s[]) {

		List<String> names = List.of("Ram", "Mohan", "Shyam", "Ghanshyam", "Tarun", "Deepak", "Satish");

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

		for (int i = 0; i < names.size(); i++) {

			executorService.submit(new Printer(cyclicBarrier, names.get(i)));
		}

		System.out.println("Task Completed");
	}
}

class Printer implements Callable<String> {

	private final CyclicBarrier cyclicBarrier;
	private String name;

	public Printer(CyclicBarrier cyclicBarrier, String name) {
		super();
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
	}

	@Override
	public String call() throws Exception {

		System.out.println("Waiting :");
		Thread.sleep(1000);
		cyclicBarrier.await();
		System.out.println("Thread : " + Thread.currentThread().getName() + ", Task : " + name);
		
		cyclicBarrier.await();
		System.out.println("Reused cyclicBarrier waiting :");
		
		return "ok";
	}
}