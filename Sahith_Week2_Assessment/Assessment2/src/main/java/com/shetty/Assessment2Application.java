package com.shetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan
@Controller
public class Assessment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment2Application.class, args);
	}

	@RequestMapping("/")
	String WelcomeMessage() {
		System.out.println("hello from spring boot app assess");
		return "homepage";
	}
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
