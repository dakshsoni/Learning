package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.ComputerClass;
import com.example.demo.beans.ComputerClass.USB;

@SpringBootApplication
public class StaticNastedClassApplication {

	public static void main(String[] args) {
		
		ComputerClass computerClass1 = new ComputerClass("Acer Predator Helios Neo 14", "Acer", "Window");
		ComputerClass computerClass2 = new ComputerClass("Acer Aspire 7 (2024)", "Acer", "Linux");
		
		computerClass1.operatingSystem.display();
		computerClass2.operatingSystem.display();
		
		USB usb = new ComputerClass.USB("Type-C");
		usb.display();
		
		
		
		SpringApplication.run(StaticNastedClassApplication.class, args);
	}

}
