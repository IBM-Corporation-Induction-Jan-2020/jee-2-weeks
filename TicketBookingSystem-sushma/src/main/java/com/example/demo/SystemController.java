package com.example.demo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = { "com.example.demo" })

public class SystemController {

	@RequestMapping("/passCreation")
	String showPage() {
		return "PassengerCreation";
	}

	@RequestMapping("/EnterDetailsForCreation")
	String getPassengerDetails(HttpServletRequest req) {
		String userName = req.getParameter("name");
		String mailId = req.getParameter("mailid");
		System.out.println("Entered user  name " + userName);

		Passenger passenger = new Passenger();
		AccessSqlDatapassenger sql = new AccessSqlDatapassenger();
		int id = (int) sql.insertData(userName, mailId);
		sql.retriveData();
		passenger.setMail(mailId);
		passenger.setName(userName);
		passenger.setId(id);
		req.setAttribute("passenger", passenger);
		return "details";
	}

	@RequestMapping("/ServiceDetails")
	String showPage(HttpServletRequest req) {
		AccessSqlDatapassenger sql = new AccessSqlDatapassenger();
		List<Service> serviceList = sql.retriveData();
		req.setAttribute("service-0", serviceList.get(0));
		req.setAttribute("service-1", serviceList.get(1));
		req.setAttribute("service-2", serviceList.get(2));
		req.setAttribute("service-3", serviceList.get(3));
		req.setAttribute("service-4", serviceList.get(4));
		return "servicedetails";
	}

	@RequestMapping("/EnterDetails")
	String takeInput() {
		System.out.println("YEs............i am here");
		return "tickets";
	}

	@RequestMapping("/bookingSuccess")
	String getDetails(HttpServletRequest req) throws ParseException {

		String userId = req.getParameter("userid");
		String serviceId = req.getParameter("serviceid");
		String noOfSeats = req.getParameter("numberofseats");

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		Ticket ticket = new Ticket();
		AccessSqlDatapassenger sql = new AccessSqlDatapassenger();
		System.out.println("USer id is" + userId);
		ticket = sql.ticketBooking(userId, serviceId, noOfSeats, dateFormat.format(date), ticket);

		System.out.println("dnf  " + ticket);
		if (ticket.bookingId == 0) {
			return "bookingunsuccessful";
		} else {
			req.setAttribute("ticketbooked", ticket);
			return "bookingsuccess";
		}
	}

	@RequestMapping("/EnterUserId")
	String takeUserId() {
		return "usertickethistory";
	}

	@RequestMapping("/viewTickets")
	String getUserTickets(HttpServletRequest req) throws ParseException {

		String userId = req.getParameter("userid");

		AccessSqlDatapassenger sql = new AccessSqlDatapassenger();

		List<Ticket> userTicketList = sql.getUserTickets(userId);

		req.setAttribute("userticketlist", userTicketList);

		return "bookingsuccess";

	}
}
