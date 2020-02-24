package com.example.demo;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.startup.UserDatabase;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.orm.jpa.hibernate.SpringJtaPlatform;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TicketController {
	
	@RequestMapping("/services")
	String showServices() {
		return "services";
	}
	
	
	@RequestMapping("/creation")
	String createUser() {
		return "create";
	}
	
	@RequestMapping("/booking")
	String ticketBooking() {
		return "book";
	}
	
	@RequestMapping("/cuscreation")
	ModelAndView customerCreation(HttpServletRequest req) {

		String cusName = req.getParameter("userName");
		String cusMail = req.getParameter("userMail");
		
		//System.out.println(cusName);
		
		User userDetails = new User();
		userDetails.setName(cusName);
		userDetails.setMailId(cusMail);
		
		TicketDAO td = new TicketDAO();
		TicketID t = td.insertDB(userDetails);
		
		ModelAndView mv = new ModelAndView("success");
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("userobject", userDetails);
		hm.put("bookingid", t.getTicketId());
		
		mv.addAllObjects(hm);
		
		return mv;
	}
	@RequestMapping("/bookingstatus")
	ModelAndView bookingTicket(HttpServletRequest req) {

		int userID = Integer.parseInt(req.getParameter("userId"));
		int bookingID = Integer.parseInt(req.getParameter("bookingId"));
		int serviceID = Integer.parseInt(req.getParameter("serviceId"));
		int noTicket = Integer.parseInt(req.getParameter("ticketCount"));
		
		//System.out.println(serviceID);
		
		TicketService ts = new TicketService();
		boolean result = ts.verifyUser(userID,bookingID,noTicket,serviceID);
		
		ModelAndView done = new ModelAndView("bookingdone");
		ModelAndView failed = new ModelAndView("bookingfailed");
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		done.addAllObjects(hm);
		failed.addAllObjects(hm);
		
		if (result) {
			return done;
		} else {
			return failed;
		}		
	}
}
