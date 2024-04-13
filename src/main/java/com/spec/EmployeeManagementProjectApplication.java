package com.spec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class EmployeeManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementProjectApplication.class, args);
		System.out.println("Server started");
	}

}
