package com.khushboo.spring.boot.ticket.booking.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/createUser")
	String createUser(HttpServletRequest req) {
		
		String name = req.getParameter("reqName");
		String email = req.getParameter("reqEMail");
		
		AppUser user = new AppUser(name, email);
		

		
	
		AccessSQLData database = new AccessSQLData();
		
		
		int key = database.getID(name,email);
		
		//System.out.println(list);
		req.setAttribute("use", user);
		req.setAttribute("gID", key);
		return "userCreated";
	}
}
