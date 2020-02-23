package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketSystemController {

	int cost =0;
	int count=0;
	
	@RequestMapping("/fetchuserchoice")
	String getUserChoice() {
		System.out.println("... User Selection ...");
		return "fetchuserchoice";
	}
	
	@RequestMapping("/fetchpassenger")
	String getUserData() {
		System.out.println("... User Creation ...");
		return "fetchpassenger";
	}
	
	@RequestMapping("/details")
	String createUser(HttpServletRequest req) {
		System.out.println("... creating User ...");
		String name = req.getParameter("uname");
		String mail = req.getParameter("umail");
		
		Passenger user = new Passenger();
		user.setName(name);
		user.setMail(mail);
		
		Database db = new Database();
		int id =db.insertDatabse(user);
		user.setId(id);
		
		count++;
		
		req.setAttribute("pg", user);
		return "details";
		
		
	}
	@RequestMapping("/fetchservice")
	String serviceInfo(HttpServletRequest req) {
		System.out.println("... Service Info ...");

		
		return "fetchservice";
				
	}

//	@RequestMapping("/validateinfo")
//	String validateuser() {
//		System.out.println("... Validating user ...");
//		
//		return "validateinfo";
//		
//	}
//	
//	@RequestMapping("/validateuser")
//	String validateuser(HttpServletRequest req) {
//		System.out.println("... Validating user ...");
//		
//		String id = req.getParameter("uid");
//		
//		Database dbs = new Database();
//		dbs.getvalidate(id);
//		
//		count=Integer.parseInt(id);
//		
//		return "validateuser";
//		
//	}
//	
	
	
	@RequestMapping("/fetchticket")
	String ticketInfo(HttpServletRequest req) {
		Passenger pasn = new Passenger();
		
		Database dbw = new Database();
		pasn=dbw.getbody(count);
		
		
		String ticketId = req.getParameter("uticket");
		
		pasn.setTickets(ticketId);
		
		
		String count = req.getParameter("ucount");
		
		Ticket createTicket = new Ticket();
		createTicket.list();
		
		createTicket.details(pasn);
		
		switch (ticketId) {
		case "1":
			createTicket.gen1(req,ticketId,count,pasn);
			break;

		case "2":
			createTicket.gen2(req,ticketId,count,pasn);
			break;
		
		case "3":
			createTicket.gen3(req,ticketId,count,pasn);
			break;
		
		case "4":
			createTicket.gen4(req,ticketId,count,pasn);
			break;
		
		case "5":
			createTicket.gen5(req,ticketId,count,pasn);
			break;	
		default:
			break;
		}
		
		return "fetchticket"+ticketId;
	}
	
	@RequestMapping("/fetchservices")
	String getservices() {
		return "fetchservices";
	}
	
}
