package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {

	@RequestMapping("/calculateCost")
	String costCalculation(HttpServletRequest tick) {
		System.out.println("-------Ticket Generation-----");

		int quantity = Integer.parseInt(tick.getParameter("rquant"));
		String name = tick.getParameter("rtrain");

		int cost = 0;
		Ticket ticket = new Ticket();

		if (name.equalsIgnoreCase("satabdi")) {

			cost = 100 * quantity;

			ticket.setTname("Satabdi Express");
			ticket.setDstation("Banglore");
			ticket.setAstation("Chennai");
			ticket.setQuant(quantity);
			ticket.setCost(cost);

		}

		else if (name.equalsIgnoreCase("doronto")) {

			cost = 200 * quantity;

			ticket.setTname("Doronto Express");
			ticket.setDstation("Banglore");
			ticket.setAstation("Kolkata");
			ticket.setQuant(quantity);
			ticket.setCost(cost);

		}

		else if (name.equalsIgnoreCase("deccan")) {

			cost = 300 * quantity;

			ticket.setTname("Deccan Express");
			ticket.setDstation("Banglore");
			ticket.setAstation("Hyderabad");
			ticket.setQuant(quantity);
			ticket.setCost(cost);

		}

		else if (name.equalsIgnoreCase("rajasthanroyal")) {

			cost = 400 * quantity;

			ticket.setTname("Rajasthan Royal Express");
			ticket.setDstation("Banglore");
			ticket.setAstation("jaipur");
			ticket.setQuant(quantity);
			ticket.setCost(cost);

		}

		else if (name.equalsIgnoreCase("rajdhani")) {

			cost = 500 * quantity;

			ticket.setTname("Rajdhani Express");
			ticket.setDstation("Banglore");
			ticket.setAstation("New Delhi");
			ticket.setQuant(quantity);
			ticket.setCost(cost);

		}

		tick.setAttribute("ticket", ticket);
		return "ticketdetails";

	}
}
