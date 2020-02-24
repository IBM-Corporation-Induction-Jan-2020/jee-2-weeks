package com.pranav.ticket.booking;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {
	Passenger ps = new Passenger();
	Services[] svc = new Services[5];
	
	@RequestMapping(value="/fetchPassenger", method = RequestMethod.POST)
	String storePassenger(HttpServletRequest res)
	{
		String pName = res.getParameter("pname");
		String pEmail = res.getParameter("email");
		System.out.println(pName + " " + pEmail);
		
		try {

			java.sql.Connection con = null;

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IBM", "root", "Pranav@123");
			PreparedStatement prepStmt;

			prepStmt = con.prepareStatement("insert into passenger(name, email) values(?,?);",
					Statement.RETURN_GENERATED_KEYS);
			prepStmt.setString(1, pName);
			prepStmt.setString(2, pEmail);
			prepStmt.execute();
			ResultSet rs = prepStmt.getGeneratedKeys();
			int generatedKey = 0;
			if (rs.next()) {
				generatedKey = rs.getInt(1);
			}
			ps.setId(generatedKey);
			ps.setName(pName);
			ps.setMail(pEmail);
			System.out.println("Inserted record's ID: " + generatedKey);
			// set your String value in the attribute

		}
		catch(Exception e)
		{
			System.out.println("PassengerController()"+e.getMessage());
		}
		res.setAttribute("User", ps); 
		return "idDetails";
	}
	
	@RequestMapping(value="/services")
	String serviceInformation(HttpServletRequest res)
	{
		serviceSetter();
		
		res.setAttribute("serv", svc);
		
		return "service";
	}
	
	
	private void serviceSetter() {
		Services sc = new Services();
		sc.setId(11);
		sc.setSrc("Delhi");
		sc.setDest("Mumbai");
		sc.setCost(2500);
		svc[0]=sc;
		
		Services sc2 = new Services();
		sc2.setId(22);
		sc2.setSrc("Delhi");
		sc2.setDest("Bangalore");
		sc2.setCost(3500);
		svc[1]=(sc2);
		
		Services sc3 = new Services();
		sc3.setId(33);
		sc3.setSrc("Delhi");
		sc3.setDest("Chennai");
		sc3.setCost(4000);
		svc[2]=(sc3);
		
		Services sc4 = new Services();
		sc4.setId(44);
		sc4.setSrc("Delhi");
		sc4.setDest("Kolkata");
		sc4.setCost(3800);
		svc[3]=(sc4);
		
		Services sc5 = new Services();
		sc5.setId(55);
		sc5.setSrc("Delhi");
		sc5.setDest("Hyderabad");
		sc5.setCost(3200);
		svc[4]=sc5;		
	}

	@RequestMapping(value="/ticket")
	String bookTickets(HttpServletRequest req) {

		String serviceID = req.getParameter("sid");
		String userID = req.getParameter("uid");
		String count = req.getParameter("count");
		String[] op = new String[6];
		
		try {

			java.sql.Connection con = null;

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IBM", "root", "Pranav@123");
			java.sql.Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select * from passenger");
			System.out.println("executed query in the db");
			boolean pRetrieval=false;
			boolean sRetrieval=false;
			String oname;
			int cost=0;
			while(results.next())
			{	
				
				int rpid = results.getInt("id");
				
				if(rpid==Integer.parseInt(userID))
				{
					oname = results.getString("name");
					pRetrieval=true;
					op[0]=userID;
					op[1]=oname;
					break;
				}
			}
			
			for(int i=0;i<svc.length;i++)
			{
				if(svc[i].getId()==Integer.parseInt(serviceID))
				{
					cost = svc[i].getCost()*Integer.parseInt(count);
					op[4] = svc[i].getSrc();
					op[5] =svc[i].getDest();
					sRetrieval=true;
					break;
				}
			}
			
			
			if(pRetrieval && sRetrieval)
			{
				int ticketNo = (int) (Math.random()*1000);
				op[2]=ticketNo+"";
				op[3]=cost+"";
				
				req.setAttribute("output", op);
				System.out.println("Success");
				return "success";
			}
			
		return "fail";
	}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}

}
