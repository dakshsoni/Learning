package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.LocalInnerClassExample;

@SpringBootApplication
public class LocalInnerClassApplication {

	public static void main(String[] args) {
		
		LocalInnerClassExample localInnerClassApplication = new LocalInnerClassExample("Deepak", 10, 0);
		
		localInnerClassApplication.reserverRoom("Deepak", 10);
				
		SpringApplication.run(LocalInnerClassApplication.class, args);
	}

}
