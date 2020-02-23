package com.example.demo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PassengerController {

	@RequestMapping("/homepage")
	String goingHomepage() {
		return "homepage";
	}

	@RequestMapping("/createPassenger")
	String insertPassenger() {
		System.out.println("Would to like to create passenger?");
		return "passenger";
	}

	@RequestMapping("/passengerdetails")
	String createNewRestaurant(HttpServletRequest req) throws ClassNotFoundException, SQLException {
		System.out.println("--------NEW PASSENGER-------------");

		String name = req.getParameter("rname");
		String mail = req.getParameter("remail");

		Passenger pas = new Passenger();
		pas.setName(name);
		pas.setMail(mail);

		PassengerDatabase db = new PassengerDatabase();
		int id = db.insertDatabase(pas);
		
		pas.setId(id);

		System.out.println(name + ":" + mail);
		req.setAttribute("past", pas);

		return "passengerdetails";

	}
	
	@RequestMapping("/chooseTrain")
	String showTrainServices(HttpServletRequest reqs) {
		return "trainservices";
		
	}
	
	@RequestMapping("/bookTicket")
	String showTicket(HttpServletRequest reqs) {
		return "ticketservices";
		
	}
}