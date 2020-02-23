package com.khushboo.spring.boot.ticket.booking.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookTickets {

	@RequestMapping("/bookTickets")
	String bookTickets(HttpServletRequest req) {

		String serviceID = req.getParameter("serviceRef");
		String userID = req.getParameter("userRef");
		/*
		 * AvailableServices serve = new AvailableServices();
		 * 
		 * List<Services> service = serve.getList(); System.out.println(service);
		 */

		AccessSQLData data = new AccessSQLData();
		boolean exists = data.validateID(userID);

		int ticketNo = (int) (Math.random() * 10000);

		req.setAttribute("tNo", ticketNo);

		/*
		 * if (service.contains(serviceID)) { if (exists == true) return
		 * "generatedTicket"; } else return "error";
		 */

		if (exists == true)
			return "generatedTicket";
		else
			return "error";
	}
}
