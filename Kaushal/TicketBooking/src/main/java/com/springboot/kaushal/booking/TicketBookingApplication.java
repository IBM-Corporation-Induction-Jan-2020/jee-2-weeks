package com.springboot.kaushal.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
     @Bean
     public User getUser() {
    	 return new User();
     }
     @Bean
     public DatabaseCon getCon() {
    	 return new DatabaseCon();
     }
}
