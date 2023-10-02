package com.example.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		System.out.println("feature -2 added sucessfully");
		SpringApplication.run(SpringProjectApplication.class, args);
		System.out.println("feature -1 added sucessfully");
	}

}
