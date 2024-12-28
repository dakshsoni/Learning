package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.CustomThreadClass;
import com.example.demo.beans.SynchronizationExample;

@SpringBootApplication
public class SynchronizationExampleApplication {

	public static void main(String[] args) throws InterruptedException {
		
		SynchronizationExample synchronizationExample = new SynchronizationExample();
		CustomThreadClass customThreadClass1 = new CustomThreadClass(synchronizationExample);
		CustomThreadClass customThreadClass2 = new CustomThreadClass(synchronizationExample);
		
		customThreadClass1.start();
		customThreadClass2.start();
		customThreadClass1.join();
		customThreadClass2.join();
		
		System.out.println(synchronizationExample.getCount());
		SpringApplication.run(SynchronizationExampleApplication.class, args);
	}

}
