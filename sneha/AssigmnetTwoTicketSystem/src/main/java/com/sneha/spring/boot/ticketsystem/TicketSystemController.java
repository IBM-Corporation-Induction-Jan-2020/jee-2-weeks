package com.sneha.spring.boot.ticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = {"com.sneha.spring.boot","com.sneha.spring.boot.ticketsystem"})
public class TicketSystemController {
	
	Services[] sc=new Services[5];
		
	@RequestMapping("/createPassenger")
	String insertResturant()
	{
		System.out.println("...Would like to create passenger...");
		return "passenger";
	}
	
	@RequestMapping("/newPassenger")
	String createNewPassenger(HttpServletRequest req) throws ClassNotFoundException, SQLException
	{
		Passenger passenger=new Passenger();
		
		String passengerName=req.getParameter("pname");
		passenger.setName(passengerName);
		String passengerMail=req.getParameter("pmail"); 
		passenger.setMail(passengerMail);
		String passengerTicket=req.getParameter("pticket");
		passenger.setTickets(passengerTicket);
		
		req.setAttribute("pdetails",passenger);
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "snehasaha");
		System.out.println("Connection Successful");
		
		PreparedStatement prepstat = con.prepareStatement("insert into passenger(name,mail,ticket) values(?,?,?);",Statement.RETURN_GENERATED_KEYS);
		//prepstat.setInt(1, passenger.getId());
		prepstat.setString(1, passenger.getName());
		prepstat.setString(2, passenger.getMail());
		prepstat.setString(3, passenger.getTickets());
		prepstat.execute();
		System.out.println("Successfully added");
		
		int id=0;
		ResultSet rs=prepstat.getGeneratedKeys();
		if(rs != null && rs.next())
		{   
			id = rs.getInt(1);
		}
		passenger.setId(id);
		
		rs.close();                        
		prepstat.close();
		
		return "passengerCreation";
	}
	
	@RequestMapping("/servicesInfo")
	String serviceInformation(HttpServletRequest req)
	{
		setServices();
		req.setAttribute("sdetails", sc);
		
		return "service";
	}
	
	private void setServices() {

		sc[0] = new Services();
		sc[0].setId(111);
		sc[0].setRoute("Bangalore-Chennai");
		sc[0].setCostPerSeat(200);
		
		sc[1]=new Services();
		sc[1].setId(222);
		sc[1].setRoute("Bangalore-Hyderabad");
		sc[1].setCostPerSeat(300);
		
		sc[2]=new Services();
		sc[2].setId(333);
		sc[2].setRoute("Bangalore-Kolkata");
		sc[2].setCostPerSeat(100);
		
		sc[3]=new Services();
		sc[3].setId(444);
		sc[3].setRoute("Chennai-Bangalore");
		sc[3].setCostPerSeat(500);
		
		sc[4]=new Services();
		sc[4].setId(555);
		sc[4].setRoute("Hyderabad-Bangalore");
		sc[4].setCostPerSeat(400);
	}

	@RequestMapping("/ticketCreation")
	String ticketCreationMsg()
	{
		System.out.println("....Would like to book ticket.....");
		return "ticket";
	}
	
	@RequestMapping("/newTicket")
	String ticketCreationMethod(HttpServletRequest req) throws ClassNotFoundException, SQLException
	{
		int dbpid;
		String dbpname = null;
		String sroute = null;
		int total = 0;
		
		boolean presentPId=false, presentSId=false;
		
		setServices();
		
		int pid=Integer.parseInt(req.getParameter("pid"));
		int sid=Integer.parseInt(req.getParameter("sid"));
		int seats=Integer.parseInt(req.getParameter("pseats"));
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "snehasaha");
		System.out.println("Connection Successful");
		PreparedStatement prepstat = con.prepareStatement("select * from passenger");
		
		ResultSet rs = prepstat.executeQuery();         
		while (rs.next())
		{                   
			dbpid= rs.getInt(1);
			dbpname=rs.getString(2);
			
			if(dbpid==pid)
			{
				presentPId=true;
				break;
			}
		 
		}
		
		for(int i=0;i<5;i++)
		{
			if(sc[i].getId()==sid)
			{
				sroute=sc[i].getRoute();
				total=seats*sc[i].getCostPerSeat();
				presentSId=true;
				break;
			}
		}
		
		if(presentPId==true && presentSId==true)
		{
			PreparedStatement prep = con.prepareStatement("insert into booking(pid,sid,sroute,amount) values(?,?,?,?);",Statement.RETURN_GENERATED_KEYS);
			prep.setInt(1, pid);
			prep.setInt(2, sid);
			prep.setString(3, sroute);
			prep.setInt(4, total);
			prep.execute();
			System.out.println("Successfully added");
			
			int id=0;
			ResultSet res=prep.getGeneratedKeys();
			if(res != null && res.next())
			{   
				id = res.getInt(1);
			}
			
			rs.close();                        
			prepstat.close();
			
			Object[] obj=new Object[] {dbpname,sroute,total,id};
			req.setAttribute("details", obj);
			System.out.println("....Successful ticket booking....");
			return "success";
		}
		else
		{
			System.out.println("....Failure in ticket booking....");
			return "failure";
		}
	}
}