package edu.cjcsmsapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsappApplication {

	public static void main(String[] args) {
		System.out.println("This is SMS Project");
		SpringApplication.run(SmsappApplication.class, args);
	}

}
 