package main;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String s[]) {

		List<String> names = List.of("Ram", "Mohan", "Shyam", "Ghanshyam", "Tarun", "Deepak", "Satish");

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		CountDownLatch countDownLatch = new CountDownLatch(names.size());

		
		for (int i = 0; i < names.size(); i++) {

			
			executorService.submit(new Printer(countDownLatch, names.get(i)));
		}

		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}

}

class Printer implements Callable<String>{

	private final CountDownLatch countDownLatch;
	private  String name;

	public Printer(CountDownLatch countDownLatch, String name) {
		super();
		this.countDownLatch = countDownLatch;
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		
		try {
			Thread.sleep(2000);
			System.out.println("Thread : " + Thread.currentThread().getName() + ", Task : " + name);
		
		} catch (Exception e) {
		
			System.out.println(e.getLocalizedMessage());
		
		}finally {
			
			countDownLatch.countDown();
		}
		return "ok";
	}
}
