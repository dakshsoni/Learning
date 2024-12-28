package com.learn;

import com.learn.beans.Resource;

public class InnterThreadCommunication {

	public static void main(String s[]) {

		Resource resource = new Resource();

		Runnable producer = () -> {

			for (int i = 1; i < 20; i++) {
				resource.produceDaata(i);
			}
		};

		Runnable consumer = () -> {

			for (int i = 1; i < 20; i++) {
				resource.consumeDaata();
			}
		};
		
		
		Thread t1 = new Thread(producer, "Thread-1");
		Thread t2 = new Thread(consumer, "Thread-2");
		
		t1.start();
		t2.start();
		
		

	}

}
