package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = {"com.example.demo"})
public class JavaThreeWeeksAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaThreeWeeksAssignmentApplication.class, args);
	}
	
	@RequestMapping("/")
	String welcomeMsg() {
		System.out.println("... Ticket Booking System ...");
		return "homepage";
	}

}
