package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Car;
import com.example.demo.beans.Car.Engine;

@SpringBootApplication
public class InnerClassExampleApplication {

	public static void main(String[] args) {
		
		
		Car maruti = new Car();
		
		
		maruti.setModelName("Maruti Suzuki");
		maruti.setEngineStarted(false);
		
		Engine engine1 = maruti.new Engine();
		engine1.startEngine();
		engine1.startEngine();
		Engine engine2 = maruti.new Engine();
		engine2.stopEngine();
		engine2.stopEngine();
		
		
		SpringApplication.run(InnerClassExampleApplication.class, args);
	}

}
