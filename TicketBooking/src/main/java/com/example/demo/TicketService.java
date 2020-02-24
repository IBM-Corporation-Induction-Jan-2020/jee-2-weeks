package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

public class TicketService {

	public boolean verifyUser(int userID, int bookingID, int noTicket, int serviceID) {
		
		User us = new User();
		TicketID tid = new TicketID();
		boolean result=false;
		
		MongoDbFactory df = new SimpleMongoDbFactory(new MongoClient("localhost"),"ticketapp");
		MongoTemplate mt = new MongoTemplate(df);
		
		List<TicketID> userList = mt.findAll(TicketID.class,"users");
		
		for (TicketID user : userList) {
			if (user.getTicketId()==bookingID && user.getUserId()==userID) {
				TicketDAO td = new TicketDAO();
				result = td.insertTicket(bookingID,noTicket,serviceID);
			}
		}
		return result;
	}

	

}
