package com.springboot.kaushal.booking;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.util.*;
@Controller
public class WelcomeController {
	
	@Autowired
	DatabaseCon dcon;
	@RequestMapping("/ticket")
	   public String showServices() {
		   return "services";
	 }
	@RequestMapping("/book")
    public String bookTicket() {
           	return "passenger";
    }
	@RequestMapping("/ticketCheck")
	public String getTicket() {
		return "getTicket";
	}
	
	
	@RequestMapping("/genTicket")
	public String showTicket(HttpServletRequest req ) {
		String id = req.getParameter("id");
    	User passenger = new User();
    	try {
			Connection con = dcon.createcon();
			PreparedStatement stmt = con.prepareStatement("select *from user where id = ?");
			stmt.setString(1, id);
		    ResultSet rs = stmt.executeQuery();
		    while(rs.next()) {
		    	passenger.setName(rs.getString("name"));
			    passenger.setEmail(rs.getString("email"));
			    passenger.setPrice(rs.getString("price"));
			    passenger.setSource(rs.getString("source"));
			    passenger.setDestination(rs.getString("destination"));
			    passenger.setTicket_number(rs.getString("ticket"));
			    passenger.setId(rs.getString("id"));
		    }
		    req.setAttribute("Name", passenger.getName());
		    req.setAttribute("price", passenger.getPrice());
		    req.setAttribute("Source", passenger.getSource());
		    req.setAttribute("Destination", passenger.getDestination());
		    req.setAttribute("Ticket", passenger.getTicket_number());
		    
    	}catch(Exception e) {
    		e.printStackTrace();		
    	}

		
		return "show";
	}
   
    @PostMapping("/book")
    public String validateBooking(HttpServletRequest req , Model model) {
    	ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(800,700,400,900,1000));
    	User pass = new User();
    	String source = req.getParameter("source");
    	String dest = req.getParameter("destination");
    	String quan = req.getParameter("quan");
    	String price  ="";
    	if(source.equalsIgnoreCase("Chennai") && dest.equalsIgnoreCase("Bangalore")) {
    		price = Integer.toString(Integer.parseInt(quan)*800);
    		
    	}else if(source.equalsIgnoreCase("Bangalore") && dest.equalsIgnoreCase("Chennai")) {
    		price = Integer.toString(Integer.parseInt(quan)*700);
    	}else if(source.equalsIgnoreCase("Chennai") && dest.equalsIgnoreCase("Hyderabad")) {
    		price = Integer.toString(Integer.parseInt(quan)*400);
    	}else if(source.equalsIgnoreCase("KANYAKUMARI") && dest.equalsIgnoreCase("CHENNAI")) {
    		price = Integer.toString(Integer.parseInt(quan)*900);
    		
    	}else if(source.equalsIgnoreCase("Chennai") && dest.equalsIgnoreCase("Kanyakumari")) {
    		price = Integer.toString(Integer.parseInt(quan)*1000);
    	}
    	pass.setPrice(price);
    	pass.setDestination(dest);
    	pass.setSource(source);
    	pass.setEmail(req.getParameter("mail"));
    	pass.setName(req.getParameter("name"));
    	
    	int id = (int)(Math.random()*1000);
    	int ticketnumber =  (int)(Math.random()*10000);
    	pass.setTicket_number(Integer.toString(ticketnumber));
    	pass.setId(Integer.toString(id));
    	
    	try {
			Connection con = dcon.createcon();
			PreparedStatement stmt = con.prepareStatement("insert into user(name,email,id,ticket,price,source,destination) values(?,?,?,?,?,?,?)");
			stmt.setString(1, pass.getName());
			stmt.setString(2, pass.getEmail());
			stmt.setString(3, pass.getId());
			stmt.setString(4, pass.getTicket_number());
			stmt.setString(5, pass.getPrice());
			stmt.setString(6, pass.getSource());
			stmt.setString(7, pass.getDestination());
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         req.setAttribute("Name" , pass.getName());
         req.setAttribute("Ticket", pass.getTicket_number());
         req.setAttribute("ID", pass.getId());
         req.setAttribute("price", pass.getPrice());
    	return "confirm";
    }    	
    @RequestMapping("/generated")
    public String gen() {
    	
    	return "Success";
    }
    
   
}
