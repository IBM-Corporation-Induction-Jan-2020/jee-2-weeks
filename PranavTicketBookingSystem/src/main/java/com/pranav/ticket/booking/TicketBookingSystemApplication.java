package com.pranav.ticket.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ComponentScan(basePackages = "com.pranav.ticket.booking")
public class TicketBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemApplication.class, args);
	}
	
	@RequestMapping("/")
	String welcomeMsg()
	{
		return "home";
	}

}
