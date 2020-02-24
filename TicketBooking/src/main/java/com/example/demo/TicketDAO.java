package com.example.demo;

import java.util.List;



import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;

public class TicketDAO {

	public TicketID insertDB(User userDetails) {

		MongoDbFactory df = new SimpleMongoDbFactory(new MongoClient("localhost"), "ticketapp");
		MongoTemplate mt = new MongoTemplate(df);
		

		mt.insert(userDetails, "users");

		TicketID t = new TicketID();
		t.setUserId(userDetails.getId());

		mt.insert(t, "users");

		MyTickets myt = new MyTickets();
		myt.setBookingId(t.getTicketId());
		myt.setUser(userDetails.getName());

		mt.insert(myt, "users");

		System.out.println(myt.getSer1());
		System.out.println((myt.getBookingId()));

		return t;

		/*
		 * MongoClient mongoClient = new MongoClient(new ServerAddress("localhost",
		 * 27017)); DB db = mongoClient.getDB("ticketapp"); DBCollection
		 * coll=db.getCollection("test");
		 * 
		 * String json =""; BsonDocument d = BsonDocument.parse(json) ;
		 * 
		 * 
		 * BasicDBObject doc = new BasicDBObject("name", userDetails.getName())
		 * .append("mailid", userDetails.getMailId()) .append("_id", d);
		 * coll.insert(doc);
		 */

		/*
		 * String json =
		 * "{ '_id' : getNextValue(\"userid\"), 'name' :"+userDetails.getName()
		 * +", 'mailid' ," +userDetails.getMailId()+"}"; mt.executeCommand(json);
		 */

		// mt.executeCommand("db.test.insert({\"_id\":getNextValue(\"userid\"),\"name\":"+userDetails.getName()+
		// ",\"mailid\":"+userDetails.getMailId()+"}))");
		// ("db.test.insert({\"_id\":getNextValue(\"userid\"),\"name\":"+userDetails.getName()+
		// ",\"mailid\":"+userDetails.getMailId()+"})", null, null);

	}

	public boolean insertTicket(int bookingID, int noTicket, int serviceID) {

		MongoDbFactory df = new SimpleMongoDbFactory(new MongoClient("localhost"), "ticketapp");
		MongoTemplate mt = new MongoTemplate(df);
		MongoOperations mo = (MongoOperations) mt;
		
		System.out.println(bookingID);

		Query query = new Query();
		query.addCriteria(Criteria.where("bookingId").is(bookingID));
	
		
		MyTickets myt = mo.findOne(query, MyTickets.class);
		
		System.out.println(myt);

		switch (serviceID) {
		case 11:
			myt.setSer1(myt.getSer1() + noTicket);
			mo.save(myt);
			break;
		case 22:
			myt.setSer2(myt.getSer2() + noTicket);
			mo.save(myt);
			break;
		case 33:
			myt.setSer3(myt.getSer3() + noTicket);
			mo.save(myt);
			break;
		case 44:
			myt.setSer4(myt.getSer4() + noTicket);
			mo.save(myt);
			break;
		case 55:
			myt.setSer5(myt.getSer5() + noTicket);
			mo.save(myt);
			break;

		default:
			return false;
		}

		return true;

	}
}
