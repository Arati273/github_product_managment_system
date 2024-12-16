package com.cjc;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringBootProductManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("This is Product Management System Application");
		SpringApplication.run(SpringBootProductManagementSystemApplication.class, args);
	}

}
