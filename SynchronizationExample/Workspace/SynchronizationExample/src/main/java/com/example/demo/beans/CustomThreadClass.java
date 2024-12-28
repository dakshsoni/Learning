package com.example.demo.beans;

import java.util.stream.IntStream;

public class CustomThreadClass extends Thread{

	private SynchronizationExample synchronizationExample;
	
	
	public CustomThreadClass(SynchronizationExample synchronizationExample) {
		super();
		this.synchronizationExample = synchronizationExample;
	}


	@Override
	public void run() {
		
		for(int i =0; i< 1000; i++) {
			
			synchronizationExample.increaseCounter();
		}
		
	}

}
